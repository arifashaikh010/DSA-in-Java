import java.util.*;

public class QueueUsingDeque {
    static class Queue{
        Deque<Integer> d = new LinkedList<>();

        public void add(int data){
            d.addLast(data);
        }

        public int remove(){
            return d.removeFirst();
        }

        public int peek(){
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Queue");
        System.out.println("Peek : "+q.peek());
        System.out.print("Remove : ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");

    }
}
/*
Queue
Queue
Peek : 1
Remove : 1 2 3 4 5
*/