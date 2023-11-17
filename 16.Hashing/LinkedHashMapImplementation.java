//if we want to maintain order then we use 'Linked HashMap'
import java.util.*;
public class LinkedHashMapImplementation {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("US",50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println("Linked HashMap : "+lhm);
        System.out.println("HashMap : "+hm);
    }
}
// Output:
// Linked HashMap : {India=100, China=150, US=50}   //order is followed
// HashMap : {China=150, US=50, India=100}          //no order is maintain