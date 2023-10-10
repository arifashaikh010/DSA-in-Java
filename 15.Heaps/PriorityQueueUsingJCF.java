import java.util.*;
public class PriorityQueueUsingJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);  //O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        System.out.print("Elements in the Priority Queue are : ");
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");  //O(1)
            pq.remove();  //O(logn)
        }

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.add(3);  //O(logn)
        pq1.add(4);
        pq1.add(1);
        pq1.add(7);

        System.out.print("\n\nElements in the Priority Queue 1 are : ");
        while(!pq1.isEmpty()){
            System.out.print(pq1.remove()+" ");  //O(logn)
        }
    }
}
//Output : 
// Elements in the Priority Queue are  : 1 3 4 7 

//Elements in the Priority Queue 1 are : 7 4 3 1