public class FirstOccurance {
    public static int firstOcc(int arr[], int i,int key){    
        if(i==arr.length-1){  //means element not found
            return -1;
        } 
        if(arr[i]==key){          
            return i;
        }

        return firstOcc(arr,i+1,key);   //'return'
    }
    public static int lastOccMe(int arr[], int i,int key){
        if(i==0){  //means element not found
            return -1;
        } 
        if(arr[i]==key){          
            return i;
        }

        return firstOcc(arr,i-1,key);   //'return'
    }
    public static int lastOccDidi(int arr[], int i,int key){    
        if(i==arr.length){    //-1
            return -1;
        } 
        int isFound=lastOccDidi(arr, i+1, key);
        if(isFound==-1 && arr[i]==key){
              return i;
        }
        return isFound;
}
    public static void main(String[] args) {
        int arr[]={5,5,5,5};
        System.out.println("First :"+firstOcc(arr,0,15));
        System.out.println("Last  :"+lastOccMe(arr,arr.length-1,15));
        System.out.println("Last  :"+lastOccDidi(arr,0,15));
    }
}
/*Output:
for: {8,3,6,9,5,10,2,5,3}
key: 5
ans: 4

for: {8,3,6,9,5,10,2,5,3}
key: 15
ans: -1

for: {8,3,6,9,5,10,2,5,3}
key: 5
First :4
Last  :7
Last  :7

for: {5,5,5,5}
key: 5
First :0
Last  :3
Last  :3

for: {5,5,5,5}
key: 15
First :-1
Last  :-1
Last  :-1
*/