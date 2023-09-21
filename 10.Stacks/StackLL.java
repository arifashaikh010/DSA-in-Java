//import java.util.*;
public class StackLL{
    static class Node{
        int data;
        Node next;
        Node(int data){             //constructor to initialize Node
            this.data=data;
            this.next=null;
        }
    }

    //*** static is used to access all the functions ***
    static class Stack{
        static Node head=null;

        //isEmpty()
        public static boolean isEmpty(){
            return head==null;
        }

        //push()
        public static void push(int data){
            //as LL always points to head 
            //esliye ham head ko new node banayege insted head.next
            
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }

            newNode.next=head;
            head=newNode;
        }

        //pop()
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top=head.data;
            head=head.next;

            return top;
        }

        //peek()
        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            int top=head.data;
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.print("Stack elemens are : ");
        while(!s.isEmpty()){                    //empty nhi h to return hoga false and while mai hojayega 'true'
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
//Output
//Stack elemens are : 3 2 1 