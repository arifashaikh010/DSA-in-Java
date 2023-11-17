import java.util.*;

public class IterationsOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 50);
        hm.put("Nepal", 50);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println("Keys in hashmap : "+keys);

        System.out.println("\nKey-value pairs are : ");
        for (String k : keys) {                      //iterator-k, parent DS-keys
            System.out.println("Key:"+k+", value:"+hm.get(k));
        }
    }
}
// Output:
// Keys in hashmap : [China, US, Nepal, India, Indonesia]

// Key-value pairs are :
// Key:China, value:150
// Key:US, value:50
// Key:Nepal, value:50
// Key:India, value:100
// Key:Indonesia, value:50