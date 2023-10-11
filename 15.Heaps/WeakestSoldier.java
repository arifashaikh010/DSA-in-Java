import java.util.PriorityQueue;

public class WeakestSoldier{
    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;

        public Row(int soldiers, int idx){
            this.soldiers=soldiers;
            this.idx=idx;
        }

        @Override
        public int compareTo(Row r2){              //Sort by 'Comparing'       
            if(this.soldiers==r2.soldiers){        //if soldiers count is SAME then sort on the basis of idx
                return this.idx-r2.idx;
            }else{                                 //if soldiers count is NOT SAME then sort on the basis of soldiers
                return this.soldiers-r2.soldiers;
            }
        }
    }
    public static void main(String[] args) {
        int army[][]={{1,0,0,0},
                    {1,1,1,1},
                    {1,0,0,0},
                    {1,0,0,0}};

        int k=2;

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            //count soldiers for each row
            int count=0;
            for(int j=0;j<army[0].length;j++){
                if(army[i][j]==1){   //Using Ternary Operator
                    count++;         //count += army[i][j] == 1 ? 1 : 0;
                }
            }
            pq.add(new Row(count, i));
        }

        //print k soldiers
        System.out.println(k+" weakest Rows are : ");
        for(int i=0;i<k;i++){
            System.out.print("R"+pq.remove().idx+" ");
        }
    }
}
//Output :
//2 weakest Rows are : 
// R0 R2