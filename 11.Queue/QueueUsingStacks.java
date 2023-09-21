//Implementing Queue using 2 Stacks with the help of JCF
import java.util.*;

public class QueueUsingStacks {
    //queue class
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //--------------------------- Operations ---------------------------
        //1.Add/Push - O(n)
        public static void add(int data){
            //shift elements from s1 to s2
            //if it is "Empty" then it will 'not' get executed
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            //s1 is 'Empty' now
            s1.push(data);

            //shift elements from s2 to s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

        }

    
        //2.POP - O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        //2.PEEK - O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        //here upper ke queue class ka obj h q
        //Queue<Integer> q = new LinkedList<>();           Ye waala queue nhi implement karege ham
        //Uper wale queue class ka object banayege ham
        Queue q = new Queue(); 

        q.add(1);
        q.add(2);
        q.add(3);
        
        System.out.print("Elements of Queue are : ");
        //peek then remove and peek 
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
//Output
//FIFO
//Elements of Queue are : 1 2 3 