public class FibinacciNth {
    public static int fibN(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib=fibN(n-1)+fibN(n-2);
        return fib;
    }
    public static void main(String[] args) {
       System.out.println(fibN(5));
    }
}
