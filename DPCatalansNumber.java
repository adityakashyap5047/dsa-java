public class DPCatalansNumber {

    public static int catalan(int n){
        if (n == 0 || n == 1) {
            return 1;
        }

        int catN = 0;
        for (int i = 0; i < n; i++) {
            catN += catalan(i)*catalan(n-1-i);
        }

        return catN;
    }

    public static int catalan(int n, int dp[]){
        if (n == 0 || n == 1) {
            return 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += catalan(i)*catalan(n-1-i);
        }

        return dp[n] = ans;
    }
    
    public static void main(String[] args) {
        System.out.println(catalan(5));

        //memoization
        int n = 5;
        int dp[] = new int[n+1];
        System.out.println(catalan(n, dp));
    }
}
