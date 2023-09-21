public class Subset {
    public static void findSubset(String str, String ans,int i){
        //Base Case
        if(i==str.length()){
            if(ans.length()==0){                    //logic should be clear 'ans is 0'
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //Recursion
        //Yes choice
        findSubset(str, ans+str.charAt(i), i+1);   //Append

        //No choice
        findSubset(str, ans, i+1);                //Not Append
    }
    public static void main(String[] args) {
        String str="abcd";
        System.out.println("Subsets are :");
        findSubset(str, "", 0);
    }
}
/*Output :
Subsets are :
abc
ab
ac
a
bc
b
c 

*/
/*Output of updated code:
Subsets are :
abc
ab
ac
a
bc
b
c
null 
*/

/*Output for string "abcd":
Subsets are :
abcd
abc
abd
ab
acd
ac
ad
a
bcd
bc
bd
b
cd
c
d
null
*/