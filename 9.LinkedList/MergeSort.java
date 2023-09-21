public class MergeSort {
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

    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // Node mid=slow;
        // return mid;
        return slow;                    //slow is 'mid'
    }

    private Node merge(Node sortedLeft, Node sortedRight){
        Node mergedLL=new Node(-1);                  //adding -1 in mergedLL
        Node temp=mergedLL;

        while(sortedLeft!=null && sortedRight!=null){
            if(sortedLeft.data <= sortedRight.data){
                temp.next=sortedLeft;
                sortedLeft=sortedLeft.next;
                temp=temp.next;
            }else{
                temp.next=sortedRight;
                sortedRight=sortedRight.next;
                temp=temp.next;
            }
        }

        while(sortedLeft!=null){
            temp.next=sortedLeft;
            sortedLeft=sortedLeft.next;
            temp=temp.next;
        }

        while(sortedRight!=null){
            temp.next=sortedRight;
            sortedRight=sortedRight.next;
            temp=temp.next;
        }

        return mergedLL.next;
    }

    //-------------------------------------- TC :O(nlogn) ------------------------------------------------------
    public Node mergeSort(Node head){
        //base case
        if(head==null || head.next==null){
            return head;                              //Always a sorted one
        }

        //find middle
        Node mid=getMid(head);

        //left & right call merse sort
        Node rightHead=mid.next;
        mid.next=null;
        Node sortedLeft = mergeSort(head);
        Node sortedRight = mergeSort(rightHead);

        //merge
        return merge(sortedLeft,sortedRight);
    }
    public static void main(String[] args) {
        MergeSort ll = new MergeSort();              //ll is obj

        ll.addFirst(8);      
        ll.addFirst(5);
        ll.addLast(3);
        ll.addLast(2);
        ll.add(2, 4);

        System.out.println("Original Linked List: ");
        ll.print();

        System.out.println("\nSorted Linked List: ");
        ll.head=ll.mergeSort(ll.head);
        ll.print();

    }
}

/*

Output: 
Original Linked List: 
5 -> 8 -> 4 -> 3 -> 2 -> null

Sorted Linked List:
2 -> 3 -> 4 -> 5 -> 8 -> null

*/


