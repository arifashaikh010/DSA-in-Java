import java.util.*;

public class NextGreaterElement {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[]=new int[arr.length];

        System.out.print("Original Array is : ");
        print(arr);

        for(int i=arr.length-1; i>=0; i--){                           //right -> left jayege
            //1 while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            //2 if else
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            } else{
                nxtGreater[i]=arr[s.peek()];
            }

            //3 push in stack s
            s.push(i);
        }

        System.out.print("\nNGreater Array is : ");
        print(nxtGreater);
        System.out.println("\nNext Greater Element");
    }
}
// //Output
// Original Array is : 6 8 0 1 3 
// NGreater Array is : 8 -1 1 3 -1
// Next Greater Element