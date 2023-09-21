import java.util.*;
import java.util.function.DoubleToIntFunction;
public class DecreasingOrder{
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;   //to go back to calling fun() 'IMP otherwise gives wrong output'
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;   //to go back to calling fun() 'IMP otherwise gives wrong output'
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        //int n=10;
        System.out.println("Decresing order : ");
        printDec(10);

        System.out.println("Incresing order : ");
        printInc(10);
    }
}
//output:
//10 9 8 7 6 5 4 3 2 1
/*        
        Solid STACK OVERFLOW 
        for missing st : 'return;'
        at DecreasingOrder.printDec(DecreasingOrder.java:9)
        at DecreasingOrder.printDec(DecreasingOrder.java:9)
        at DecreasingOrder.printDec(DecreasingOrder.java:9)
        at DecreasingOrder.printDec(DecreasingOrder.java:9)
        at DecreasingOrder.printDec(DecreasingOrder.java:9) */