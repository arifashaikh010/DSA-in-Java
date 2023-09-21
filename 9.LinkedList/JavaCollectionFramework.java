import java.util.LinkedList;

public class JavaCollectionFramework {
    public static void main(String[] args) {
        //create 'Stores object ONLY' 
        //can't use int, float, boolean => can use Integer, Float, Character (Object ONLY)
        //classes use karna haiii..not primitive data type
    
        //create
        LinkedList<Integer> ll=new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(4);
        ll.addFirst(0);
        ll.add(2,2);     //add in the 'middle'
        ll.add(3,3);
        //0->1->2

        //print
        System.out.println("Linked List : "+ll);

        //remove
        ll.removeLast();
        System.out.println("\nRemove Last : "+ll);

        ll.removeFirst();
        System.out.println("\nRemove First : "+ll);

        }
}
/*
Linked List : [0, 1, 2, 3, 4]

Remove Last : [0, 1, 2, 3]

Remove First : [1, 2, 3]
*/