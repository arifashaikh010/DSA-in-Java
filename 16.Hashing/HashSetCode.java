import java.util.*;
public class HashSetCode {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //1.Add
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        if(set.contains(2)){
            System.out.println("Set contains 2");
        }else{
            System.out.println("Set doesn't contains 2");
        }

        //2.Remove
        set.remove(2);
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }else{
            System.out.println("Set doesn't contains 2");
        }

        //Additional
        set.clear();

        System.out.println("Is set empty : "+set.isEmpty());
    }
}
// [1, 2, 4]
// Set contains 2
// Set doesn't contains 2
// Is set empty : true