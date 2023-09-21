public class BinaryStrings {
    public static void printBinaryStrings(int n,int lastPlace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        //kaam
        printBinaryStrings(n-1, 0, str+"0");

        if(lastPlace==0){
            printBinaryStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }    
}
/*Output:
for n=0


for n=1
0
1

for n=2
00
01
10

for n=3
000
001
010
100
101

for n=4
0000
0001
0010
0100
0101
1000
1001
1010
*/