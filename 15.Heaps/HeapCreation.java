///Implement min Heap

import java.util.ArrayList;

public class HeapCreation {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        //1.insert in Heap                 =>  O(logn)
        public void add(int data){
            //add at last idx
            arr.add(data);

            int x = arr.size()-1;         //child idx
            int par = (x-1)/2;            //par idx

            while(arr.get(x) < arr.get(par)){               //O(logn)
                //child value < parrent value
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;    
            }
        }

        //2.peek in Heap
        public int peek(){
            return arr.get(0);
        }

        //3.delete (min element) in Heap
        //i. swap first element with last element
        //ii. arr.remove(last_idx)
        //iii. fix my Heap (using heapify)

        //Heapify - to fix my Heap
        //TC: O(logn)                      //logn-'height of tree'
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;
            
            if(left<arr.size() && arr.get(left)<arr.get(minIdx)){
                minIdx=left;
            }
            if(right<arr.size() && arr.get(right)<arr.get(minIdx)){
                minIdx=right;
            }

            if(minIdx!=i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            //1. swap first and last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //2. delete last element
            arr.remove(arr.size()-1);

            //3. heapify
            heapify(0);                //0 -> root
            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;            //0 == 0 ---> True || anything(except 0) == 0 ---> False
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        System.out.print("Elements in the heap are : ");
        while(!h.isEmpty()){                                  //heap sort - O(nlogn)
            System.out.print(h.peek()+" ");
            h.remove();
        }
    }
}
//Output :
//Elements in the heap are : 1 3 4 5 