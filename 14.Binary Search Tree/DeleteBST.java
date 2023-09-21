//searching TC:O(h)
public class DeleteBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
            //insert value in root node
            root = new Node(val);
            return root;
        }

        if(val<root.data){
            //left subtree
            root.left = insert(root.left, val);
        }else{
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static Node delete(Node root,int val){
        if (root == null){                         //MANDATORY ON GFG & LEETCODE
            return null;
        }

        //1.search
        //2.delete
        if(root.data<val){                             //search
            root.right=delete(root.right, val);        //delete 
        }else if(val<root.data){
            root.left=delete(root.left, val);
        }else{                                         //root.data == val
            //'Deleted Node' is found!! 
            //form delete operation on Node

            //case 1: no child(Leaf Node)
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2: single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            //case 3: two child
            Node IS = findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root=root.left;
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++){ 
            root=insert(root, values[i]);
        }

        System.out.println("Inorder traversal before deleting a node : ");
        inorder(root);

        delete(root, 12);

        System.out.println("\nInorder traversal after deleting a node : ");
        inorder(root);
    }
}
// for node=1
// Inorder traversal before deleting a node : 
// 1 3 4 5 6 8 10 11 14 
// Inorder traversal after deleting a node :
// 3 4 5 6 8 10 11 14

// for node=12
// Inorder traversal before deleting a node : 
// 1 3 4 5 6 8 10 11 14 
// Inorder traversal after deleting a node :
// 1 3 4 5 6 8 10 11 14 