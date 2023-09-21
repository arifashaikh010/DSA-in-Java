import java.util.*;
public class ReverseAL {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("ArrayList : "+list);

        System.out.print("\nReverse ArrayList : ");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
/*
ArrayList : [10, 20, 30, 40, 50]

Reverse ArrayList : 50 40 30 20 10
*/