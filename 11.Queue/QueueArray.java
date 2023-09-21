//TC
//ADD : O(1), REMOVE : O(n), PEEK : O(1)

//***Implementing Queue Using Array ***

public class QueueArray{
    //VIMP This is static class NOT static (static void) function
    static class Queue{                     //static - we are going to 'use' it in 'main function'
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr=new int[n];                         //array of size n
            size=n;
            rear=-1;
        } 

        public static boolean isEmpty(){
            return rear==-1;                   //if rear is '-1' array is 'empty' & //if rear is NOT '-1' array is 'non-empty'
        }

        //1.add
        public static void add(int data){
            //check - if queue is full 'no' any element can be added to it
            if(rear==size-1){                                //store ele from (0 to n-1)
                System.out.println("Queue is full \nCan't add an element to it");
            }

            //else add element

            rear=rear+1;                            //coz rear=-1
            arr[rear]=data;
        }

        //2.remove
        public static int remove(){
            //check - if queue is 'empty'
            if(isEmpty()){
                System.out.println("Queue is Empty");     //Nothing to remove
                return -1;
            }

            //QUEUE IS "FIFO" FIRST ELEMENT IS DELETED NOT LAST AARU..FRONT'LL BE DELETED NOT REAR
            int front=arr[0];
            for(int i=1;i<size;i++){
                arr[i-1]=arr[i];                             //left shifting element by 1
            }
            rear=rear-1;
            // ALL WRONG :(((((((((((((((((( 
            // int dlt = arr[rear];
            // arr[rear]=0;
            // rear=rear-1;   
            return front;                        
        }

        //3.peek
        public static int peek(){
            //check - if queue is 'empty'
            if(isEmpty()){
                System.out.println("Queue is Empty");     //Nothing to remove
                return -1;
            }

            int val=arr[0];       //PEEK IS FIRST ELEMENT
            return val;
        }

        public static void print(){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);               //size is 5
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.print("The Queue is : ");
        q.print();

        System.out.print("\nRemove Operation : ");
        q.remove();
        q.print();

        System.out.print("\nAdd Operation : ");
        q.add(10);
        q.print();

        int val=q.peek();
        System.out.print("\nPeek Operation : "+val);
    }
}
/*
The Queue is : 1 2 3 4 5 

Remove Operation : 2 3 4 5 5

Add Operation : 2 3 4 5 10

Peek Operation : 2
*/