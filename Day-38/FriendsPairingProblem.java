public class FriendsPairingProblem {
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        int single = friendsPairing(n-1);
        //pair
        int d2 = (n-1)* friendsPairing(n-2);
        //totalWays
        int totalWays = single + d2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendsPairing(n));
    }
}
