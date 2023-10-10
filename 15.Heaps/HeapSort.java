//TC:O(n*logn)
//SC:O(1)

public class HeapSort {
    public static void heapifyAscending(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx=i;                       //Root

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx=left;
        }

        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx=right;
        }

        if(maxIdx!=i){
            //swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapifyAscending(arr, maxIdx, size);
        }
    }
    public static void heapifyDescending(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx=i;                       //Root

        if(left < size && arr[left] < arr[minIdx]){
            minIdx=left;
        }

        if(right < size && arr[right] < arr[minIdx]){
            minIdx=right;
        }

        if(minIdx!=i){
            //swap
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapifyAscending(arr, minIdx, size);
        }
    }
    public static void heapSortA(int arr[]){
        //Ascending Order 
        //step1: build maxHeap
        int n=arr.length;
        for(int i=n/2; i>=0; i--){
            heapifyAscending(arr,i,n);
        }

        //step2: push largest at end
        for(int i=n-1; i>0; i--){
            //swap- largest element with first element
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapifyAscending(arr,0,i);
        }
    }
    public static void heapSortD(int arr[]){
        //Descending Order
        //step1: build maxHeap
        int n=arr.length;
        for(int i=n/2; i>=0; i--){
            heapifyDescending(arr,i,n);
        }

        //step2: push largest at end
        for(int i=n-1; i>0; i--){
            //swap- largest element with first element
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapifyDescending(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        heapSortA(arr);

        System.out.println("Ascending Order ");
        System.out.print("Heap Sort : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //***************************************************************************************************
        heapSortD(arr);

        System.out.println("\n\nDescending Order ");
        System.out.print("Heap Sort : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//Output:
//Ascending Order 
//Heap Sort : 1 2 3 4 5 

//Descending Order
//Heap Sort : 5 4 3 2 1 