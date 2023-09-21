import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(11);
        list.add(39);
        list.add(27);
        list.add(56);
        list.add(42);
        list.add(88);
        System.out.println("ArrayList : "+list);
        Collections.sort(list);
        System.out.println("\nSorting in assending order : "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("\nSorting in descending order : "+list);
    }
}
/*
ArrayList : [11, 39, 27, 56, 42, 88]

Sorting in assending order : [11, 27, 39, 42, 56, 88]

Sorting in descending order : [88, 56, 42, 39, 27, 11]
*/
