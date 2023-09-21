import java.util.*;
public class MinSumAbsoluteDifference {
    public static void main(String[] args) {
        int[] A={4, 1, 6, 8};
        int B[]={2, 3, 6, 5};

        //sort
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;

        for(int i=0;i<A.length;i++){
            minDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println("Minimum absolute difference of pairs is : "+minDiff);
    }
}
/*
int[] A={1,2,3};
int B[]={2,1,3};
Minimum absolute difference of pairs is : 0

int[] A={4, 1, 6, 8};
int B[]={2, 3, 6, 5};
Minimum absolute difference of pairs is : 5
*/