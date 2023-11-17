import java.util.*;

public class TreeSetCode {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();   //random order
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengluru");

        LinkedHashSet<String> lhs = new LinkedHashSet<>();   //order of Insertion is maintained
        lhs.add("Pune");
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengluru");

        TreeSet<String> ts = new TreeSet<>();   //ascending order 
        ts.add("Pune");
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengluru");

        System.out.println("Cities are : "+cities);
        System.out.println("\nLhs cities are : "+lhs);
        System.out.println("\nTs cities are : "+ts);
    }
}
// Output :
// Cities are : [Delhi, Pune, Noida, Mumbai, Bengluru]

// Lhs cities are : [Pune, Delhi, Mumbai, Noida, Bengluru]

// Ts cities are : [Bengluru, Delhi, Mumbai, Noida, Pune]