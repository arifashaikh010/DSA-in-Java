import java.util.*;

public class PushAtBottom {
    public static void PushAtBottom(Stack<Integer> s, int data){
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        PushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        PushAtBottom(s,4);
        System.out.print("Stack elemens are : ");
        while(!s.isEmpty()){                    //empty nhi h to return hoga false and while mai hojayega 'true'
            System.out.print(s.pop()+" ");
        }
    }
}
//Output :
//Stack elemens are : 3 2 1 4 
//=> 4 is at bottom hence popped out at last