public class RemoveDuplicates {
    public static void removeDuplicates(String str, int i, StringBuilder newStr, boolean map[]){
        if(i==str.length()){         //string is over eg. for car l=3 index: 0 1 2
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar=str.charAt(i);
        if(map[currChar-'a'] == true){   
            //duplicate
            removeDuplicates(str, i+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str, i+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str="appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);   //StringBuilder()
    }
}
/*Output:
for : appnnacollege
ans : apncoleg

for : arifa
ans : arif
*/