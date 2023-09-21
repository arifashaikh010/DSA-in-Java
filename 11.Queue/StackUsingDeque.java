import java.util.*;

public class StackUsingDeque {
    static class Stack{
        Deque<Integer> d = new LinkedList<>();

        public void push(int data){
            d.addLast(data);
        }

        public int pop(){
            return d.removeLast();
        }

        public int peek(){
            return d.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Stack");
        System.out.println("Peek : "+s.peek());
        System.out.print("Pop : ");
        System.out.print(s.pop()+" ");
        System.out.print(s.pop()+" ");
        System.out.print(s.pop()+" ");
        System.out.print(s.pop()+" ");
        System.out.print(s.pop()+" ");
    }
}
/*
Stack
Peek : 5
Pop : 5 4 3 2 1 
*/