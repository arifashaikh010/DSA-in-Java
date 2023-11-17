import java.util.HashMap;

public class SubarraySumEqualToK {
    public static void main(String[] args) {  //TC:O(n)
        int arr[]={10,2,-2,-20,10};
        int k=-10;

        HashMap<Integer, Integer> map = new HashMap<>();   //<sum, count>
        int sum=0,count=0;

        map.put(0, 1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Total subarrays whose sum is equal to K are : "+count);
    }
}
// Output:
// Total subarrays whose sum is equal to K are : 3