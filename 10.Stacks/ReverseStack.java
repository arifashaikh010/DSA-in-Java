import java.util.*;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int data){
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        //base case
        if(s.isEmpty()){
            //empty stack is always reverse (No need to do anything)
            return ;
        }

        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.print("Orginal Stack : 3 2 1");

        reverseStack(s);
        System.out.print("\nReverse Stack : ");
        printStack(s);
    }
}
//Output :
// Orginal Stack : 3 2 1
// Reverse Stack : 1 2 3