public class ZigZag {
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

    public void zigZag(){
        //step1: find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //step2: reverse 2nd half
        // if(head==null || head.next==null){
        //     return;
        // }

        Node curr=mid.next;
        mid.next=null;                 //LL is break
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right= prev;
        Node nextL, nextR;

        //step3: alternate merge - zigzag merge
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
    public static void main(String[] args) {
        ZigZag ll = new ZigZag();              //ll is obj
        //print                                        Time complexity: O(n)
        // ll.print();

        //addFirst addLast                             Time complexity: O(1)
        ll.addFirst(2);      
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.addLast(6);

        System.out.println("Original Linked List: ");
        ll.print();

        ll.zigZag();
        System.out.println("\nZig-Zag Linked List: ");
        ll.print();

    }
}


/*

Output:
//--------------- odd case ---------------
Original Linked List: 
1 -> 2 -> 3 -> 4 -> 5 -> null

Zig-Zag Linked List:
1 -> 5 -> 2 -> 4 -> 3 -> null

//--------------- even case ---------------
Original Linked List: 
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

Zig-Zag Linked List:
1 -> 6 -> 2 -> 5 -> 3 -> 4 -> null

//--------------- case 3 --------------- 
Original Linked List: 
2 -> null

Zig-Zag Linked List:
2 -> null

*/

