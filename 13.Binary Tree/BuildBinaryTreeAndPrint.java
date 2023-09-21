//Build Tree Preorder Code
//And print three traversals

import java.util.*;

public class BuildBinaryTreeAndPrint{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    //Preorder
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){              //-1 ka left node aur right node nhi hota
                return null;
            }

            //otherwise create new Node
            Node newNode = new Node(nodes[idx]);    //Node() constructor called
            //create left subtree as 'newNode.left'
            //recursivelly call BinaryTree..recursion apna kam karke dega
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            System.out.print(newNode.data+" ");
            return newNode;
        }

        public void printPreorder(Node root) {
            if(root==null){
                //System.out.print("-1 ");
                return;
            }

            System.out.print(root.data+" ");

            //Recursively call left subtree
            printPreorder(root.left);

            //Recursively call right subtree
            printPreorder(root.right);
        }

        public void printInorder(Node root) {
            if(root==null){
                //System.out.print("-1 ");
                return;
            }

            //Recursively call left subtree
            printInorder(root.left);

            System.out.print(root.data+" ");

            //Recursively call right subtree
            printInorder(root.right);
        }

        public void printPostorder(Node root) {
            if(root==null){
                //System.out.print("-1 ");
                return;
            }

            //Recursively call left subtree
            printInorder(root.left);

            //Recursively call right subtree
            printInorder(root.right);

            System.out.print(root.data+" ");
        }

        public void printLevelorder(Node rootNode){
            if(rootNode==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();

            q.add(rootNode);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                System.out.print(currNode.data+" ");
                //check leftNode if it is NOT NULL then ADD in queue
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                //check rightNode if it is NOT NULL then ADD in queue
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }

        public void printLevelorderNewLine(Node rootNode){
            if(rootNode==null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(rootNode);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(!q.isEmpty()){
                        q.add(null);
                    }
                } else{
                    System.out.print(currNode.data+" ");
                    //check leftNode if it is NOT NULL then ADD in queue
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    //check rightNode if it is NOT NULL then ADD in queue
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        System.out.print("Tree is build in following fashion : ");
        BinaryTree tree = new BinaryTree();
        Node rootNode = tree.buildTree(nodes);
        System.out.println("\nRoot Node is : "+rootNode.data);

        System.out.print("\nPreorder Traversal : ");
        tree.printPreorder(rootNode);

        System.out.print("\nInorder Traversal : ");
        tree.printInorder(rootNode);

        System.out.print("\nPostorder Traversal : ");
        tree.printPostorder(rootNode);

        System.out.print("\nLevelorder Traversal : ");
        tree.printLevelorder(rootNode);

        System.out.print("\nLevelorder Traversal print NextLine: \n");
        tree.printLevelorderNewLine(rootNode);
    }
}
/*
Tree is build in following fashion : 4 5 2 6 3 1          //In preorder              //not much imp
Root Node is : 1

Preorder Traversal : 1 2 4 5 3 6
Inorder Traversal : 4 2 5 1 3 6
Postorder Traversal : 4 2 5 3 6 1
Levelorder Traversal : 1 2 3 4 5 6
Levelorder Traversal print NextLine:
1
2 3
4 5 6
*/