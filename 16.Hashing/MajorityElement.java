//Given an integer array of size n, find all elements that appear more than [n/3] times
//TC:O(n)
//Brute force TC:O(n^2)
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,5,5,1,3,1,5,5,1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            // if(map.containsKey(arr[i])){          //key exists => increase frequency by one
            //     map.put(arr[i], map.get(arr[i])+1);
            // }else{                      //key doesn't exists => insert key with frequency one
            //     map.put(arr[i], 1);     //first occurance 
            // }

            //shortcut for if-else
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        Set<Integer> keySet = map.keySet();
        System.out.print("Key occurs more than "+arr.length/3+" times are : ");
        for(Integer key: keySet){
            if(map.get(key)>arr.length/3){
                System.out.print(key+" ");
            }
        }
    }
}
// Output : 
//Key occure more than 4 times are : 1 5 