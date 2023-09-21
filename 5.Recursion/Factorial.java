import java.util.*;
public class Factorial {
    public static int fact(int n){
        //int fact =1;
        if(n==0){           //0 to clear all test cases including 0!! 'NYC thought'
            return 1;
        }
        int fact=n*fact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Factorial of "+num+" :"+fact(num));
    }
}
/*Output :
Enter a number : 0
Factorial of 0 :1

Enter a number : 1
Factorial of 0 :1

Enter a number : 2
Factorial of 2 :2

Enter a number : 3
Factorial of 3 :6

Enter a number : 5
Factorial of 5 :120

Enter a number : 7
Factorial of 7 :5040 */