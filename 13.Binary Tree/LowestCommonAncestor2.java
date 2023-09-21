public class LowestCommonAncestor2 {
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

        int n1=4, n2=5;

        System.out.println("Lowest common ancestor of node "+n1+" & "+n2+" is : "+lca(root, n1, n2).data);
    }
}
//Lowest common ancestor of node 4 & 5 is : 2