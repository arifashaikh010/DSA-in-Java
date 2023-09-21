import java.util.*;
public class DemoDeque{
    public static void main(String args[]){
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(2);
        d.addFirst(1);
        d.addLast(3);
        d.addLast(4);
        System.out.println(d);
        System.out.println("First element : "+d.getFirst());
        System.out.println("Last element : "+d.getLast());
    }
}
/*
[1, 2, 3, 4]
First element : 1
Last element : 4
*/
/*
[1, 2]
[0, 1, 2, 3, 4]
*/