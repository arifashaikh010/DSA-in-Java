//First Non-Repeating Letter in the Stream
import java.util.*;

public class NonRepeatingLetter {
    public static void printNonRepeating(String str){
        int[] freq=new int[26];   //'a'-'z'
        Queue<Character> q = new LinkedList<>();

        //traverse element
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            //1.Add inside queue
            q.add(ch);

            //2.increase freq in freq array
            freq[ch-'a']++;        //char-char=0

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print("-1"+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        // //first Non-Repeating letter in a String 
        // //comment out if-else inside for loop
        // if(q.isEmpty()){
        //     System.out.print("-1"+" ");
        // }else{
        //     System.out.print(q.peek()+" ");
        // }
        // OUTPUT
        // First Non-Repeating elements in string are : 
        // x
    }
    public static void main(String[] args) {
        String str="aabccxb";
        System.out.println("OUTPUT\nFirst Non-Repeating elements in string are : ");
        printNonRepeating(str);
    }
}
/*
OUTPUT
First Non-Repeating elements in string are :
a -1 b b b b x 
*/