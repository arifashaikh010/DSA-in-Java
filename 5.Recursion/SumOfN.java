import java.util.*;
public class SumOfN {
    public static int sumOfN(int n){
        if(n==1){              //for n NATURAL No  so no need to consider 0
            return 1;
        }
        int sum=n+sumOfN(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfN(n));
    }
}
