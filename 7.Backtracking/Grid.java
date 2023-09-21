import java.math.*;
public class Grid {
    public static int gridWays(int i, int j, int n, int m){
        //base case
        if(i==n-1 && j==m-1){              //why && coz last grid pr aaya means both conditions should satisfy
            return 1;
        }else if(i==n || j==n){            //boundary cross condition
            return 0;
        }
        int w1=gridWays(i, j+1, n, m);     //right
        int w2=gridWays(i+1, j, n, m);     //down

        return w1+w2;     //total ways
    }
    public static void main(String[] args) {
        int n=3, m=3;
        //ans=(n-1+m-1)!/((n-1)!*(m-1)!);
        System.out.println("For grid "+m+"*"+n);
        System.out.print("Total no. of ways are : ");
        System.out.println(gridWays(0, 0, n, m));
    }
}
/*For grid 3*3
Total no. of ways are : 6 */