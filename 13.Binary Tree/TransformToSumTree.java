// TC : O(n)
public class TransformToSumTree {
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
    public static int transformSum(Node root){
        if(root == null){
            return 0;
        }

        int leftChild = transformSum(root.left);
        int rightChild = transformSum(root.right);

        int data = root.data ;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;

        return data;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        } 

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        /*        Input                Output
                    1                    27
                   / \                  /  \
                  2   3                9    13
                 / \ / \              / \   / \
                4  5 6  7            0   0 0   0
        */
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transformSum(root);
        System.out.print("Preorder of transform sum tree is : ");
        preorder(root);
    }
}
//Preorder of transform sum tree is : 27 9 0 0 13 0 0 