import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        //Classnmae objectName=new ClassName();                          //Create object 

        //ArrayList<dataType> name=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();                       //syntax declaration
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();

        //-------------------------------------------- operations ------------------------------------------
        //add element
        list.add(1);   //O(1)
        list.add(2);   //O(1)
        list.add(3);   //O(1)
        list.add(4);   //O(1)
        list.add(5);
        System.out.println("Add 5 elements : "+list);

        //get ith element     O(1)
        list.get(4);
        System.out.println("\nElement at i=2 is : "+list.get(2));
        
        //remove element
        list.remove(3);
        System.out.println("\nRemove element at i=3 : "+list);

        //add element at index          O(n)
        list.add(3, 4);
        System.out.println("\nAdd element 4 at i=3 : "+list);

        //set element at index OR update element
        list.set(3,10);
        System.out.println("\nSet element at i=3 : "+list);

        //contains element
        System.out.println("\nIs arrayList contains element 5 : "+list.contains(5));
        System.out.println("\nIs arrayList contains element 13 : "+list.contains(13));

        list.set(3,4);
        System.out.println("\nSet element at i=3 : "+list);

        //size of arrylist
        System.out.println("\nSize of an arraylist is : "+list.size());
        list.size();

        //print arraylist
        System.out.println("\nPrint arraylist : ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
/*
Add 5 elements : [1, 2, 3, 4, 5]

Element at i=2 is : 3

Remove element at i=3 : [1, 2, 3, 5]

Add element 4 at i=3 : [1, 2, 3, 4, 5]

Set element at i=3 : [1, 2, 3, 10, 5]

Is arrayList contains element 5 : true

Is arrayList contains element 13 : false

Set element at i=3 : [1, 2, 3, 4, 5]

Size of an arraylist is : 5

Print arraylist
1 2 3 4 5
*/ 