public class FriendsPairing {
    public static int friendsPairing(int n){
        //base condition
        if(n==1 || n==2){
            return n;
        }

        //choice
        //single
        int singleWays=friendsPairing(n-1);

        //pair
        int pairingWays=(n-1)*friendsPairing(n-2);

        //total ways
        int totalWays=singleWays+pairingWays;
        return totalWays;
        //return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(4));
    }
}
/*Output:
for : n=1
ans : 1

for : n=2
ans : 2

for : n=3
ans : 4

for : n=4
ans : 10

for : n=5
ans : 26
*/