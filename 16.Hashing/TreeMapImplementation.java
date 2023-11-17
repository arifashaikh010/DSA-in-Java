//stores key-value pair in sorting fashion
import java.util.*;
public class TreeMapImplementation {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("US",50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println("TreeMap : "+tm);
        System.out.println("HashMap : "+hm);
    }
}
// Output:
// TreeMap : {China=150, India=100, US=50}
// HashMap : {China=150, US=50, India=100}