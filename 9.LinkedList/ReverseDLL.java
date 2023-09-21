public class ReverseDLL {

    public class Node{                         //Node Class banaye
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;              //create node  
            next=null;          //this.next=null;  
            prev=null;          //this.prev=null;  
        }
    }

    public static Node head;               //head node
    public static Node tail;               //tail node
    public static int size;

    //Add
    public void addFirst(int data){
        Node newNode = new Node(data);          //create a node
        size++;
        if(head==null){                         //size=0
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    //Remove
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is 'empty'");
            return Integer.MIN_VALUE;
        }

        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }

        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    
    //print
    public void print(){
        // if(head == null){                                 //empty linkedlist
        //     System.out.print("Linked List is empty: ");
        //     //return optional
        // }

        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;    //
        }
        System.out.println("null");                         //optional
    }

    public void reverse(){
        //3 nodes we r making:   prev => curr => next
        Node prev = null;                        //(assuming) as curr=head ..so prev'll be null
        Node curr = head;                //tail = head; because reverse karne ke bad tail mai head ki value aayegi 
        Node next;

        while(curr!=null){             //remember as:-  3 variables 4 steps
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head=prev;                     //as curr==null
    }
    public static void main(String[] args) {
        ReverseDLL dll=new ReverseDLL();                  //object creation

        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        System.out.println("Original Linked List : ");
        dll.print();

        System.out.println("\nSize of Linked List : "+size);

        System.out.println("\nReverse Linked List : ");
        dll.reverse();
        dll.print();

        //hw
        //addLast()
        //removeLast()
    }
}
/*
Output:
Original Linked List : 
1 <-> 2 <-> 3 <-> 4 <-> 5 <-> null

Size of Linked List : 5

Reverse Linked List :
5 <-> 4 <-> 3 <-> 2 <-> 1 <-> null
*/