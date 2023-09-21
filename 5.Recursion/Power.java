public class Power {
    public static int power(int base,int pow){
        if(pow==0){
            return 1;
        }
        //int ans=base*power(base, pow-1);
        //return ans;
        return base*power(base, pow-1);
    }

    //Optimized Power Function
    public static int powerOpt(int base,int pow){
        if(pow==0){
            return 1;
        }
        int halfPower=powerOpt(base, pow/2);
        int fullPower=halfPower*halfPower;  

        //for odd power
        if(pow%2 != 0){
            fullPower=base*fullPower;
        }
        return fullPower;
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
        System.out.println(powerOpt(2,10));
    }
}
/*
for 2,4:
16
*/