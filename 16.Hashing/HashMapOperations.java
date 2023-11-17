//HashMaps are 'unordered maps' in JAVA
import java.util.HashMap;

public class HashMapOperations{
    public static void main(String[] args) {
        //create hashmap
        HashMap<String,Integer> hm = new HashMap<>();

        //1.Insert Operation    TC:O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        //Print hashmap
        System.out.println(hm);

        //2.Get Operation    TC:O(1)
        //syntax: hm.get(key);
        int population = hm.get("India");
        System.out.println("\nPopulation of India is : "+population);
        System.out.println("Population of India is : "+hm.get("korea"));   //unknown key

        //3.ContainsKey Operation    TC:O(1)
        //syntax: hm.containsKey(key);
        System.out.println("\nDoes hm contains key-India : "+hm.containsKey("India"));
        System.out.println("Does hm contains key-UAE : "+hm.containsKey("Dubai"));

        //4.Remove Operation         TC:O(1)
        //syntax: hm.remove(key);      (key,value) pair gets deleted
        System.out.println("\nRemove key-US : "+hm.remove("US"));
        System.out.println(hm);

        //5.size
        System.out.println("\nSize : "+hm.size());

        //6.Is Empty
        System.out.println("\nEmpty : "+hm.isEmpty());

        //7.Clear
        hm.clear();
        System.out.println("\nAfter clearing hm, Empty : "+hm.isEmpty());
    }
}
//Output:
//{China=150, US=50, India=100}

// Population of India is : 100
// Population of India is : null

// Does hm contains key-India : true
// Does hm contains key-UAE : false

// Remove key-US : 50
// {China=150, India=100}

// Size : 2

// Empty : false

// After clearing hm, Empty : true