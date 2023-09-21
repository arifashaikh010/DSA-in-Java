// Time complexity:O(n)
public class Reverse{
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

    public void reverse(){
        //3 nodes we r making:   prev => curr => next
        Node prev = null;                        //(assuming) as curr=head ..so prev'll be null
        Node curr = tail = head;                //tail = head; because reverse karne ke bad tail mai head ki value aayegi 
        Node next;

        while(curr!=null){             //remember as:-  3 variables 4 steps
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head=prev;                     //as curr==null
    }
   
    public static void main(String[] args) {
        Reverse ll = new Reverse();              //ll is obj
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
        ll.reverse();
        System.out.println("reverse Linked List: ");
        ll.print();
    }
}

/*Output:

Original Linked List: 
1 -> 2 -> 3 -> 4 -> 5 -> null
reverse Linked List:
5 -> 4 -> 3 -> 2 -> 1 -> null

*/
