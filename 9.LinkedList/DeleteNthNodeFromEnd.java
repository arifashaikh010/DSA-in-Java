public class DeleteNthNodeFromEnd {
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

    //v easyy
    public static void deleteNthfromEnd(int n){
        System.out.println("N = "+n);
        //1.calculate size
        int size=0;
        Node temp=head;                   
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        //previous loc:(size-n)th
        //deleted loc:(size-n+1)th 

        //Case 1: Remove first
        //Condition to check..n==size last se n back means 'HEAD'
        if(n==size){
            head=head.next;      //remove head
            return;
        } 

        //Case 2: Calculate (size-n) i.e. Prev
        int i=1;
        Node prev=head;
        int prevIndex=size-n;        //indexToFind
        while(i<prevIndex){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;

    }

    public static void main(String[] args) {
        DeleteNthNodeFromEnd ll = new DeleteNthNodeFromEnd();              //ll is obj
        //print                                        Time complexity: O(n)
        // ll.print();

        //addFirst addLast                             Time complexity: O(1)
        ll.addFirst(2);      
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        System.out.println("Original Linked List: ");
        ll.print();

        System.out.println("\nRemove 3rd Element from end/last: ");
        deleteNthfromEnd(3);
        ll.print();

    }
}


/*Output:

Original Linked List: 
1 -> 2 -> 3 -> 4 -> 5 -> null

Remove 3rd Element from end/last:
N = 3
1 -> 2 -> 4 -> 5 -> null

*/
