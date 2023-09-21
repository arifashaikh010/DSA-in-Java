import java.util.*;
public class BacktrackingOnArrays{
    public static void setArray(int arr[],int i,int val){
        //Base Case
        if(i==arr.length){
            System.out.print("Array inside setaArray function: ");
            printArr(arr);
            return;                //It is very imp "must" to write return inside Base Case of 'Recursion'
        }

        //kaam 
        arr[i]=val;

        //recursion
        setArray(arr, i+1, val+1);

        //BACKTRACKING = kaam after recursion
        arr[i]=arr[i]-2;                   //Backtracking 
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]= new int[5];
        setArray(arr,0,1);
        System.out.print("Array inside main function: ");
        printArr(arr);
    }
}

/*Output:
Array inside setaArray function: 1 2 3 4 5
Array inside main function: -1 0 1 2 3
*/