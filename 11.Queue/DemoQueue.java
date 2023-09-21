//#FAV
//Implementing Queue using JAVA COLLECTION FRAMEWORK(JCF)
//TC in JCF
//ADD : O(1), REMOVE : O(1), PEEK : O(1)

import java.util.*;
public class DemoQueue {
    public static void main(String[] args) {
        //Queue ka object nhi ban sakta kyoki queue ek 'Interface' haii
        Queue<Integer> q = new LinkedList<>();            //ArrayDeque
        //Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Elements of Queue are : ");
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
/*
Elements of Queue are : 
1
2                                                            
3 
*/