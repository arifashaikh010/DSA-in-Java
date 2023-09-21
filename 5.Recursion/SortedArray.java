public class SortedArray {
    public static boolean isSorted(int arr[], int i){    //this int i is IMP #must
         if(i==arr.length-1){
            return true;
         }
        if(arr[i]<arr[i+1]){          //modified by me little bit
            return isSorted(arr,i+1);
        }
        
        return false;
        
        /*if(arr[i]>arr[i+1]){           //by didi
            return false;
        }
            
        return isSorted(arr,i+1);
        */
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,4,5};
        System.out.println(isSorted(arr,0));
    }
}

/*
public class SortedArray {
    public static boolean isSorted(int arr[], int i){
         if(i==arr.length-1){
            return true;
         }
        if(arr[i]<arr[i+1]){
            return isSorted(arr,i+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={5};
        System.out.println(isSorted(arr,0));
    }
}
*/

/*Output:
for : 5     //coz base case is True
ans: true

for : 1,2,3,4,5
ans: true

for : 1,2,3,6,4,5
ans: false
*/