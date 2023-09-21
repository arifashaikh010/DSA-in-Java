import java.util.*;

public class IndianCoins {
    public static void main(String args[]){
        Integer coins[]={1,2,5,10,20,50,100,200,500,2000};

        //sort in descending order
        //Arrays.sort(coins, Collections.reverseOrder());           //OR
        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins=0;
        int amount=1059;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }
        System.out.println("Total (min) coins used : "+countOfCoins);
        System.out.print("For 1059 Coins used are : ");
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
/*
Output:
Total (min) coins used : 4
For 590 Coins used are : 500 50 20 20

Total (min) coins used : 6
For 1059 Coins used are : 500 500 50 5 2 2
*/