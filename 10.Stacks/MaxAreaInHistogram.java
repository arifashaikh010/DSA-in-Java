import java.util.*;

public class MaxAreaInHistogram {

    public static int maxArea(int[] heights){
        int maxArea=0;
        int nsr[]=new int[heights.length]; 
        int nsl[]=new int[heights.length]; 

        //Next Smaller Right
        Stack<Integer> s = new Stack<>();

        for(int i=heights.length-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }

            if(s.isEmpty()){
                //-1
                nsr[i]=heights.length;
            } else{
                //top
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //Next Smaller Left
        s = new Stack<>();                 //empty stack

        for(int i=0; i<heights.length; i++){              //forward start
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }

            if(s.isEmpty()){
                //-1
                nsl[i]=-1;
            } else{
                //top
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //curr area
        for(int i=0; i<heights.length; i++){
            int height = heights[i];
            int width =   nsr[i] - nsl[i] -1;
            int currArea=height*width;
            maxArea=Math.max(currArea,maxArea);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};

        System.out.println("Max area of histogram is : "+maxArea(arr));
    }
}
//Output
//Max area of histogram is : 10