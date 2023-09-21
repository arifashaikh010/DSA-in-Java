public class OccuranceIndices {
    public static void printOccuranceIndices(int arr[], int i,int key){
        if(i==arr.length){
            return;
        }

        if(arr[i]==key){
            System.out.print(i+" ");
        }
        printOccuranceIndices(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        printOccuranceIndices(arr, 0, key);
    }
}
//OUTPUT : 1 5 7 8