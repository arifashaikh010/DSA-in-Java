import java.util.HashMap;

public class LargestSubarrayWithSumZero {     
    public static void main(String[] args) {      //TC: O(n)
        int arr[] = {15,-2,2,-8,1,7,10,23};

        HashMap<Integer, Integer> map = new HashMap<>();  //<sum,idx>

        int sum=0;
        int len=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                len=Math.max(len, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }

        System.out.println("Largest Subarray with sum as 0 is : "+len);
    }
}
// Output:
// Largest Subarray with sum as 0 is : 5