import java.util.*;
public class TillingProblem {
    public static int tillingProblem(int n){  //floor: 2xn
        //base case
        if(n==0 || n==1){
            return 1;
        }

        //kaam
        //vertical choice
        int verticlTiles=tillingProblem(n-1);
        
        //horizontal choice
        int horizontal=tillingProblem(n-2);

        int ways=verticlTiles+horizontal;

        return ways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num=sc.nextInt();
        System.out.println("Board dimention is 2 X "+num+"\nNo of ways are :"+tillingProblem(num));
    }
}
/*Output :
Enter number :0
Board dimention is 2 X 0
No of ways are :1

Enter number :1
Board dimention is 2 X 1
No of ways are :1

Enter number :2
Board dimention is 2 X 2
No of ways are :2

Enter number :3
Board dimention is 2 X 3
No of ways are :3

Enter number :4
Board dimention is 2 X 4
No of ways are :5

Enter number :5
Board dimention is 2 X 5
No of ways are :8
*/