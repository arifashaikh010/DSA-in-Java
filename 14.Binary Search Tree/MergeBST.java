public class MergeBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        /*
               2
              / \
             1   4
             BST1
        */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
               9
              / \
             3  12
             BST1
        */
        Node root2 = new Node(9);
        root1.left = new Node(3);
        root1.right = new Node(12);
    }
}
