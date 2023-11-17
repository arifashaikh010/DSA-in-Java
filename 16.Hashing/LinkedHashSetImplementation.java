//Linked HashMap is used to implement Linked HashSet
//Linked HashSet is a 'ordered set' implemented using DLL
//"Order of Insertion" is ""maintained""
import java.util.*;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();   //print in random order
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengluru");

        LinkedHashSet<String> lhs = new LinkedHashSet<>();   //printing order and Order of Insertion is same
        lhs.add("Pune");
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengluru");

        System.out.println("Cities are : "+cities);
        System.out.println("\nLhs cities are : "+lhs);


        lhs.remove("Noida");
        System.out.println("\nAfter deleting Noida .. Lhs cities are : "+lhs);
    }
}
// Cities are : [Delhi, Pune, Noida, Mumbai, Bengluru]

// Lhs cities are : [Pune, Delhi, Mumbai, Noida, Bengluru]

// After deleting Noida .. Lhs cities are : [Pune, Delhi, Mumbai, Bengluru