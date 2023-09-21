import java.util.*;
public class SwapElement {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(14);
        list.add(35);
        list.add(22);
        list.add(18);
        System.out.println("ArrayList Before swap : "+list);

        // MMMMMMMMMMMMMMMMMMMMMEEEEEEEEEEEEEEEEEEEEEEEEEE
        // System.out.println("\nSwap elemt at i=2 and i=5");
        // System.out.println("Before swap : "+list);
        // int i=2;
        // int j=3;
        // int temp=list.get(i);
        // list.set(i,list.get(j));
        // // int list.set(i)=list.get(j);
        // list.set(j,temp);
        // System.out.println("After swap : "+list);

        //DIIIIDDDDDDDIIIIIIIIIIIIIIIIIIIIIIIIIIIIII
        int ind1=1,ind2=3;
        // System.out.println(list);
        System.out.println("\nSwap elemements at i=1 and i=3");
        swap(list, ind1, ind2);
        System.out.println("ArrayList After swap : "+list);
    }
}
/*
ArrayList Before swap : [1, 23, 14, 35, 22, 18]

Swap elemements at i=1 and i=3
ArrayList After swap : [1, 35, 14, 23, 22, 18]
*/ 