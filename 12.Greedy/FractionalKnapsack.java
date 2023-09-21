import java.util.*;

class FractionalKnapsack{
    public static void main(String[] args) {
        //given
        int value[]={60, 100, 120};
        int weight[]={10, 20, 30};
        int W=50;
 
        double ratio[][]=new double[value.length][2];
        //col 0 : idx
        //col 1 : ratio (value/weight)
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=(double)value[i]/weight[i];       //int to double conversion..ans may be comes in decimal
        }

        //sort according to ratio
        //max ration max profit
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        //result ascending order sorting 
        
        int capacity=W;
        int maxValue=0;
        for(int i=ratio.length-1; i>=0; i--){
            int idx=(int)ratio[i][0];                            //i last idx of ratio..max ratio   //VIMP
            if(capacity >= weight[idx]){
                maxValue += value[idx];
                capacity -= weight[idx];
            }else{
                //calculate price, price = ratio*capacity
                //Include 'Fractional Item'
                maxValue += capacity*ratio[i][1];
                capacity = 0;
            }
        }

        System.out.println("Maximum total value is : "+maxValue);
    }
}
//Maximum total value is : 240