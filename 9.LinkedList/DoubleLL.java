
public class DoubleLL {
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

    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();                  //object creation

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        System.out.println("Original Linked List : ");
        dll.print();

        System.out.println("\nSize of Linked List : "+size);

        int dlt = dll.removeFirst();
        System.out.println("\nLinked List after Remove First : ");
        dll.print();
        System.out.println("Removed element is : "+dlt);

        //System.out.println(dll.removeFirst());

        System.out.println("\nSize of Linked List : "+size);

        //hw
        //addLast()
        //removeLast()
    }
}
/*
Output:
Original Linked List : 
1 <-> 2 <-> 3 <-> null

Size of Linked List : 3

Linked List after Remove First :
2 <-> 3 <-> null
Removed element is : 1

Size of Linked List : 2
*/