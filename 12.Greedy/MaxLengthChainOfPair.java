// #Learnings :
// Row (pair.length) : 5
// Col (pair[0].length) : 2

import java.util.*;

public class MaxLengthChainOfPair {
    public static void main(String args[]){
        int pair[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};

        //sort (Based on col 1)
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        //select 1st pair
        int chainLen = 1;
        int chainEnd = pair[0][1];

        for(int i=1; i<pair.length; i++){
            if(pair[i][0] > chainEnd){
                chainLen++;
                chainEnd=pair[i][1];
            }
        }

        System.out.println("Maximum length of chain is : "+chainLen);

        System.out.println("\n#Learnings : ");
        System.out.println("Row (pair.length) : "+pair.length);
        System.out.println("Col (pair[0].length) : "+pair[0].length);
    }
}
//Maximum length of chain is : 3

// #Learnings :
// Row (pair.length) : 5
// Col (pair[0].length) : 2