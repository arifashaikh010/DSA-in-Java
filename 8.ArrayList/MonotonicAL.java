import java.util.*;
public class MonotonicAL {
    public static boolean isMonotonic(ArrayList<Integer> nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) > nums.get(i+1)){
                increasing = false;
            }
            if(nums.get(i) > nums.get(i+1)){
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        System.out.println(isMonotonic(nums));
    }
}
