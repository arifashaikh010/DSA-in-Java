public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            // // left and right Subtree are bydefault 'null'
            // this.left=null;
            // this.right=null;
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
    public static void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }

        //to verify our output
        System.out.print("Inorder traversal of BST : ");
        inorder(root);
    }
}

//Output 2:
//for int values[]={5,1,3,4,2,7};
//Inorder traversal of BST : 1 2 3 4 5 7 

//H.W.
//Output 2:
//for int values[]={5,1,2,3,4,7,6,8,10,9};
//Inorder traversal of BST : 1 2 3 4 5 6 7 8 9 10 