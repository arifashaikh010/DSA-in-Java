//Union & Intersection of 2 arrays
//TC : O(n+m)

import java.util.HashSet;
import java.util.Iterator;

public class UnionIntersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        int count=0;
        
        HashSet<Integer> set = new HashSet<>();

        //union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        System.out.print("Union of 2 arrays : ");
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("\nUnion : "+set.size());

        //intersection
        set.clear();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        System.out.print("\nIntersection of 2 arrays : ");
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }
        System.out.println("\nIntersection : "+count);
    }
}
// Output:
// Union of 2 arrays : 2 3 4 6 7 9 
// Union : 6

// Intersection of 2 arrays : 3 9
// Intersection : 2