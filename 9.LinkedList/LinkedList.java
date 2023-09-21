public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){          //constructor
            this.data = data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //******************************************* ADD *****************************************
    public void addFirst(int data){
        //step 1 = create a new node
        Node newNode = new Node(data);               //obj create: Class objName = new Class();
        size++;
        //if LinkedList is 'empty'
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 = newNode next = head
        newNode.next = head;

        //step 3 = head = newNode
        head = newNode;
    }

    public void addLast(int data){
        //step1: create a new node
        Node newNode = new Node(data);
        size++;
        //if LinkedList is 'empty'
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2: tail next = newNode
        tail.next = newNode;

        //step3: tail = newNode
        tail = newNode;
    }

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
    
        //step1 craete a new node
        Node newNode = new Node(data);
        size++;
        Node temp =head;
        int i=0;

        while(i<idx-1){
            temp = temp.next;
            i++;

            newNode.next = temp.next;
            temp.next= newNode;
        }
    }

    //***************** print linkedlist *********************
    public void print(){
        if(head == null){                                 //empty linkedlist
            System.out.print("Linked List is empty: ");
            //return optional
        }

        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");                         //optional
    }

    //************************************** REMOVE ***************************************
    public int removeFirst(){
        if(size ==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size ==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }

        //prev : i = size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }

        int val = tail.data;   //prev.next.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();              //ll is obj
        //print                                        Time complexity: O(n)
        // ll.print();

        //addFirst addLast                             Time complexity: O(1)
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        System.out.println("Linked List: ");
        ll.print();

        System.out.println("\nSize: "+ll.size);

        ll.removeFirst();
        System.out.println("\nLinked List removeFirst: ");
        ll.print();

        ll.removeLast();
        System.out.println("\nLinked List removeLast: ");
        ll.print();

        System.out.println("\nSize: "+ll.size);
    }
}

/*
Linked List: 
1 -> 2 -> 3 -> 4 -> 5 -> null

Size: 5

Linked List removeFirst:
2 -> 3 -> 4 -> 5 -> null

Linked List removeLast:
2 -> 3 -> 4 -> null

Size: 3



Linked List is empty: null
Add first: 2 -> null
Add first: 1 -> 2 -> null
Add last : 1 -> 2 -> 3 -> null
Add last : 1 -> 2 -> 3 -> 4 -> null
Linked List: 1 -> 2 -> 3 -> 4 -> null


Linked List is empty
Add first: 2
Add first: 1 2
Add last : 1 2 3
Add last : 1 2 3 4
Linked List: 1 2 3 4
*/