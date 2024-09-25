public class FriendsPairingProblem {
    public static int pairingWays(int n){
        if (n == 1 || n == 2) {
            return n;
        }
        int single = pairingWays(n-1);
        int pair = (n-1)*pairingWays(n-2);
        return single + pair;
    }
    public static void main(String[] args) {
        System.out.println(pairingWays(3));
    }
}
