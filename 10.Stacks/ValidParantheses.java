import java.util.*;

public class ValidParantheses {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{'){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if( (s.peek()=='(' && ch==')') || (s.peek()=='[' && ch==']') || 
                    (s.peek()=='{' && ch=='}')){
                        s.pop();
                } else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println("Is the string '"+str+"' valid? : "+isValid(str));

        String str2 = "({}){[]";
        System.out.println("\nIs the string '"+str2+"' valid? : "+isValid(str2));

    }
}
//Output
//Is the string '({})[]' valid? : true
//
// Is the string '({}){[]' valid? : false 