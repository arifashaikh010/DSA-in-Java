import java.util.*;
public class WaterLevel {
    //brute force approach       ===> time complexity:O(n^2)
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int heightW = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int water=heightW*width;
                // if(maxWater<water){
                //     maxWater = water;
                // }
                maxWater = Math.max(water, maxWater);
            }
        }
        return maxWater;
    }

    //2 pointer approach     ===> O(n)
    public static int storeWater2(ArrayList<Integer> height){
        int maxWater = 0;
        int lp=0,rp=height.size()-1;
        while(lp<rp){//lp traverse d path & rp traverse n-d path toghether they traverse n path.Hence reduce time complexity
            int ht = Math.min(height.get(lp), height.get(rp));
            int wd = rp-lp;
            int water = ht * wd;
            maxWater = Math.max(water, maxWater);
            if(height.get(lp)<height.get(rp)){              //height.get(lp) & height.get(rp) is V IMP NOT 'lp rp'
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
        System.out.println(storeWater2(height));
    }
}
//Output: 49  by brute force approach
//Output: 49  by 2 pointer approach