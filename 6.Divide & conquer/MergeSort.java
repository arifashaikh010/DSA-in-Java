public class MergeSort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();               //'CODING STANDARDS' 
    }
    public static void mergeSort(int arr[],int si, int ei){
        //base case
        if(si>=ei){
            return;
        }

        int mid=si+(ei-si)/2;        //OR mid=(si+ei)/2;
        mergeSort(arr, si, mid);     //sort left part         //assuming recursion will sort left part
        mergeSort(arr, mid+1, ei);   //sort right part        //assuming recursion will sort right part
        //arrays are sorted

        //now merge these two sorted arrays
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[],int si,int mid, int ei){
        int temp[]= new int[ei-si+1];      //our starting index is '0'

        //maine si ke jaah pr 0 likha tha:(
        int i=si;       //iterator for left part      traverse from (0 to mid)
        int j=mid+1;   //iterator for right part     traverse from (mid+1 to ei)
        int k=0; //iterator for temp array;   traverse from (0 to ei) & use to arrange elements in sorted order

        while(i<=mid && j<=ei){    //why =
            if(arr[i]<arr[j]){
                temp[k]=arr[i];       //arr[k]=arr[j]; i was writing insted of "*temp*"
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //incase while loop end and still elements remain in leftmost/rightmot array then 
        //*****HERE only one of this 2 array is remained NOT elemets in TWO ARRAYS ARE REMAINED!!!!*****

        //left part
        //since only left part is remain so there is not comparison of these elements with any other(right part) elemsts
        //also this left part is already sorted. So print is as it is:)

        while(i<=mid){
            temp[k++]=arr[i++];
            //i++;
            //k++;
        }

        //right part
        while(j<=ei){
            temp[k]=arr[j];
            j++;
            k++;
        }

        //maine si ke jaah pr 0 likha tha:(
        //copy temp array to original array
        for(k=0 ,i=si;k<temp.length;k++ ,i++){
            arr[i]=temp[k];
        }
        System.out.println("Temp");
        printArray(temp); //why thi is not working 
    }
    public static void main(String[] args) {
        int arr[]={6, 3, 9, 5, 2, 8};                 //"int arr2[]=new int[5];"         6,3,9,5,2,8
        mergeSort(arr, 0, arr.length-1);
        System.out.print("\nOriginal sorted array :");
        printArray(arr);
    }
}