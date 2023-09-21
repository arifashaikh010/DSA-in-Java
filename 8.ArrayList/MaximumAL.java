import java.util.*;
public class MaximumAL {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;

        ArrayList<Integer> list= new ArrayList<>();

        list.add(1);
        list.add(9);
        list.add(6);
        list.add(4);
        list.add(23);
        list.add(54);

        System.out.println("Arraylist : "+list);

        for(int i=0;i<list.size();i++){
            // if(list.get(i)>max){
            //     max=list.get(i);
            // }
            max=Math.max(max, list.get(i));
        }

        System.out.println("Maximum is : "+max);
    }
}
/*
Arraylist : [1, 9, 6, 4, 23, 54]
Maximum is : 54

Arraylist : [-1, -9, -6, -4, -23, -54]
Maximum is : -1

Arraylist : [-1, -9, -6, 0, -23, -54]
Maximum is : 0

Arraylist : [-1, -9, -6, 0, 3, -54]
Maximum is : 3
*/