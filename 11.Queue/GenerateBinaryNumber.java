import java.util.*;

public class GenerateBinaryNumber {
    public static void generateBinaryNumber(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");

        while(n-- >0){
            String s = q.remove();
            System.out.print(s+" ");
            q.add(s+"0");
            q.add(s+"1");
        }
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("N : "+n);
        System.out.print("Binary No's are : ");
        generateBinaryNumber(5);
    }
}
//ArrayList
//ArrayList<String> ans = new ArrayList<>();
//String s = q.remove();
//            ans.add(s);
//return ans;

/*
N : 2
Binary No's are : 1 10

N : 5
Binary No's are : 1 10 11 100 101

N : 10
Binary No's are : 1 10 11 100 101 110 111 1000 1001 1010
*/