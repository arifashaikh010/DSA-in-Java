public class RemoveCycle {
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


    public static void removeCycle(){
        //Detect cycle
        Node slow=head;
        Node fast=head;
        boolean exists=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                exists=true;
                break;
            }
        }

        if(exists == false){
            System.out.println("No cycle exists");
            return;
        }

        //Find meeting point
        //slow=head
        //slow+1 fast+1
        slow =head;
        Node prev=null;

        while(slow!=fast){
            prev=fast;
            slow=slow.next;              //+1
            fast=fast.next;              //+1
        }

        //Remove cycle
        prev.next=null;
    }
    public static void main(String[] args) {
        RemoveCycle ll = new RemoveCycle();   

        // // addFirst addLast                             Time complexity: O(1)
        // // ******* Linear Linked List *******
        // ll.addFirst(2);      
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);

        // System.out.println("Original Linked List: ");
        // ll.print();

        // // ******* Circular Linked List *******
        head = new Node(1);
        Node temp=new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->2

        System.out.println("Original Linked List: \n1->2->3->2");

        ll.removeCycle();
        System.out.println("\nLinked List after Removing Cycle: ");
        ll.print();

    }
}


/*

Output:

Original Linked List: 
1->2->3->2

Linked List after Removing Cycle: 
1 -> 2 -> 3 -> null

*/

