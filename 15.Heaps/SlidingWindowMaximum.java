import java.util.PriorityQueue;

import javax.management.openmbean.CompositeData;

public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int val, int idx){
            this.val=val;
            this.idx=idx;
        }

        @Override
        public int compareTo(Pair p2){
            //ascending order - sort
            // return this.val-p2.val;    //sort in ascending order on the basis of val
            //ascending order - sort
            return p2.val-this.val;       //sort in descending order on the basis of val
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;   //window size
        int res[]=new int[arr.length-k+1]; 

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        //store 1st window elements
        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i], i));
        }

        res[0]=pq.peek().val;

        //store result for remaining elements
        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            res[i-k+1]=pq.peek().val;
        }

        //print result
        System.out.println("Output for window size "+k+" is : ");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
//Output :
// Output for window size 3 is : 
// 3 3 5 5 6 7