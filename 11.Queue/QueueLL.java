//TC
//ADD : O(1), REMOVE : O(1), PEEK : O(1)

//***Implementing Queue Using Array ***
public class QueueLL{
    static class Node{
        int data;
        Node next;

        Node(int data){                       //constructor
            this.data=data;
            this.next=null;
        }
    }

    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        //1.Add
        public static void add(int data){
            Node newNode= new Node(data);
            //adding 1st element
            if(head==null){
                head=tail=newNode;
                return;
            }
            //otherwise
            tail.next=newNode;
            tail=newNode;
        }

        //2.remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            
            int front=head.data;

            //single element exist then remove it make head=tail=null
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;
        }

        //3.peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int result=head.data;
            return result;
        }
    }

    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Queue is:");
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
/*
Queue is:
1
2
3
*/