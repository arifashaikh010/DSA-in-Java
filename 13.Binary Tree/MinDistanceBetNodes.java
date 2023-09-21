//Minimun Distance between two nodes
public class MinDistanceBetNodes {
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

    public static Node lca(Node root, int n1, int n2){
        if(root == null){
            return null;
        }

        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node lcaLeft = lca(root.left, n1, n2);
        Node lcaRight = lca(root.right, n1, n2);

        //lcaLeft = val, lcaRight = null
        if(lcaRight == null){
            return lcaLeft;
        }

        //lcaRight = val, lcaLeft = null
        if(lcaLeft == null){
            return lcaRight;
        }

        return root;
    }

    public static int lcaDistance(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDistance = lcaDistance(root.left, n);
        int rightDistance = lcaDistance(root.right, n);
 
        if(leftDistance == -1 && rightDistance == -1){
            return -1;
        }else if(leftDistance == -1){
            return rightDistance+1;
        }else{
            return leftDistance+1;
        }
    }

    public static int minDistance(Node root, int n1, int n2){
        Node lca = lca(root, n1, n2);
 
        int leftDistance = lcaDistance(lca, n1);
        int rightDistance = lcaDistance(lca, n2);

        return leftDistance+rightDistance;
    }
    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
        */
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1=4, n2=6;

        System.out.println("Minimum distance between nodes "+n1+" & "+n2+" is : "+minDistance(root, n1, n2));
    }
}
//Minimum distance between nodes 4 & 6 is : 4