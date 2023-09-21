//reverse a queue
import java.util.*;

public class Reversal {
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.print("Original queue is : ");
        System.out.print("1 2 3 4 5");
        reverse(q);
        //print q
        System.out.print("\nReverse queue is  : ");
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
/*
Original queue is : 1 2 3 4 5
Reverse queue is  : 5 4 3 2 1
 */