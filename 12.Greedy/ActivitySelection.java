import java.util.*;
public class ActivitySelection{
    public static void main(String[] args) {
        int start[]={1, 3, 0, 5, 8, 5};
        int end[]={2, 4, 6, 7, 9, 9};

        //end time is sorted already
        //if end time is NOT sorted then DO
        int activities[][]= new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        //Sort
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxActivity=0;
        ArrayList<Integer> ans = new ArrayList<>();    //going to store indexes of activities which a person can perform 
        
        //start with 1st activity
        maxActivity=1;
        ans.add(activities[0][0]);
        int endTime=activities[0][2];          //will be required to select next activity

        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=endTime){            //non-overlapping activity
                //select that activity
                maxActivity++;
                ans.add(activities[i][0]);
                endTime=activities[i][2];   
            }
        }

        System.out.print("Start : ");
        for(int i=0;i<start.length;i++){
            System.out.print(start[i]+" ");
        }
        System.out.print("\n\nEnd   : ");
        for(int i=0;i<end.length;i++){
            System.out.print(end[i]+" ");
        }
        System.out.println("\n\nMaximum Activities which user can perform are : "+maxActivity);
        System.out.print("\nActivities are : ");
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
/*
Start : 1 3 0 5 8 5 

End   : 2 4 6 7 9 9

Maximum Activities which user can perform are : 4

Activities are : A0 A1 A3 A4
*/

//Program with 2 columns ..start & end

// public class ActivitySelection{
//     public static void main(String[] args) {
//         int start[]={1, 3, 0, 5, 8, 5};
//         int end[]={2, 4, 6, 7, 9, 9};

//         //end time is sorted already
//         //if end time is NOT sorted then DO
//         int activities[][]= new int[start.length][2];
//         for(int i=0;i<start.length;i++){
//             activities[i][0]=start[i];
//             activities[i][1]=end[i];
//         }

//         //Sort
//         Arrays.sort(activities, Comparator.comparingDouble(o -> o[1]));

//         int maxActivity=0;

//         //start with 1st activity
//         maxActivity=1;
//         int endTime=activities[0][1];          //will be required to select next activity

//         for(int i=1;i<end.length;i++){
//             if(activities[i][0]>=endTime){            //non-overlapping activity
//                 //select that activity
//                 maxActivity++;
//                 endTime=activities[i][1];   
//             }
//         }

//         System.out.print("Start : ");
//         for(int i=0;i<start.length;i++){
//             System.out.print(start[i]+" ");
//         }
//         System.out.print("\nEnd   : ");
//         for(int i=0;i<end.length;i++){
//             System.out.print(end[i]+" ");
//         }
//         System.out.println("\nMaximum Activities which user can perform are : "+maxActivity);
//     }
// }
// /*
// Start : 1 3 0 5 8 5 
// End   : 2 4 6 7 9 9
// Maximum Activities which user can perform are : 4
// */ 