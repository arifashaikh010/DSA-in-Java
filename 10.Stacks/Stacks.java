//in-built-Using Java Collection Framework
//JCF mai isEmpty(), push(), pop(), peek() ye bhi hota haii
import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.print("Stack elements are : ");
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
//Output
//Stack elements are : 5 4 3 2 1 