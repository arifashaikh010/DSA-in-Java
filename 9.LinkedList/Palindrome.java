public class Palindrome {
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

    //Slow-Fast Approach
    public Node findMid(Node head){                         //helper
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;         //+1
            fast=fast.next.next;    //+2
        }
        return slow;                //slow is my midNode
    }

    public boolean checkPalindrome(){
        //base case/ corner case
        if(head==null || head.next==null){             //either LL it is 'empty' or there is 'only one' node
            return true;                               //always a Palindrome           
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev=null;
        Node curr=midNode;                          //Otherwise head to reverse whole string
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //curr==null  => prev is right half head
        //right and left naming krliya
        Node right=prev;
        Node left=head;

        //step3 - check left half and right half
        while(right!=null){                    //Gr8 right.next Also working!!:) [1,2] It gives wrong ans '.n':(
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome ll = new Palindrome();              //ll is obj
        //print                                        Time complexity: O(n)
        // ll.print();

        //addFirst addLast                             Time complexity: O(1)
        ll.addFirst(2);      
        ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        System.out.println("Original Linked List: ");
        ll.print();

        
        System.out.println("Is the given linked list palindrome : "+ll.checkPalindrome());

    }
}

/*Output:

Original Linked List: 
1 -> 2 -> 2 -> 1 -> null
Is the given linked list palindrome : true

Original Linked List: 
1 -> 2 -> 3 -> 4 -> 5 -> null
Is the given linked list palindrome : false

*/

//-------------------------------------------------------------------------------------------------
/*

public class Palindrome {
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

    public static void main(String[] args) {
        Palindrome ll = new Palindrome();              //ll is obj
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

        
        ll.print();

    }
}
*/

/*

Output:

*/

