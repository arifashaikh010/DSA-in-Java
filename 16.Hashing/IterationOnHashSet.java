import java.util.*;
public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengluru");

        //Method 1: Using Iterator
        Iterator it = cities.iterator();
        System.out.println("Traversing elements of set cities using iterator : ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Method 2: Using Advance Loop
        //for-each loop
        System.out.println("\nTraversing elements of set cities using for-each loop : ");
        for(String city: cities){     //String city in my cities
            System.out.println(city);
        }
    }
}
// Outpput: UNORDERED OUTPUT
// Traversing elements of set cities using iterator : 
// Delhi
// Pune
// Noida
// Mumbai
// Bengluru

// Traversing elements of set cities using for-each loop :      
// Delhi
// Pune
// Noida
// Mumbai
// Bengluru