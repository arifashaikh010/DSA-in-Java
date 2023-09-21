import java.util.*;

public class DuplicateParantheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            
            //closing
            if(ch ==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;      //duplicate
                } else{
                    s.pop();          //oening pair
                }
            } else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";    //true
        String str2="(a-b)";     //false

        System.out.println("Is Duplicate Parantheses exists the in string "+str+" : "+isDuplicate(str));
        System.out.println("\nIs Duplicate Parantheses exists the in string "+str2+" : "+isDuplicate(str2));
    }
}

// //Output:
// Is Duplicate Parantheses exists the in string ((a+b)) : true

// Is Duplicate Parantheses exists the in string (a-b) : false



//OR
// public static boolean isDuplicate(String str){
//         Stack<Character{> s=new Stack<>();
        
//         for(int i=0; i<str.length(); i++){
//             char ch= str.charAt(i);
            
//             //closing
//             if(ch ==')'){
//                 int count=0;
//                 while(s.peek()!='('){
//                     s.pop();
//                     count++;
//                 }
//                 if(count<1){
//                     return true;      //duplicate
//                 } else{
//                     s.pop();          //oening pair
//                 }
//             } else{
//                 //opening
//                 s.push(ch);
//             }
//         }
//         return false;
//     }
// }