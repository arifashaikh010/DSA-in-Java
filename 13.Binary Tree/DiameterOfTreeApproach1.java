//Approach 1 
//Time Complexity : O(n^2)
public class DiameterOfTreeApproach1 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int height = Math.max(leftHeight,rightHeight)+1;
        return height;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        int leftHeight = height(root.left);
        int rightHeight = height(root.right); 

        int selfDiameter = leftHeight+rightHeight+1;

        int ans = Math.max(Math.max(leftDiameter, rightDiameter), selfDiameter );
        return ans;
    }
    public static void main(String args[]){
        /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
        */
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        int ans = diameter(root);
        System.out.println("Diameter of a tree is : "+ans);
    }
}
//Diameter of a tree is : 5