public class DPClimbStairs123 {
    
    public static int climbingWays(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        return climbingWays(n-1) + climbingWays(n-2) + climbingWays(n-3);
    }

    public static int climbingWaysMem(int n, int dp[]){
        if (n == 0 || n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = climbingWays(n-1) + climbingWays(n-2) + climbingWays(n-3);
        return dp[n];
    }

    public static int climbingWaysTab(int n){
        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;

        //T.C - O(3^n);

        //recursion
        System.out.println(climbingWays(n));

        // T.C - O(n)

        //memoization
        int dp[] = new int[n+1];
        System.out.println(climbingWaysMem(n, dp));

        //tabulation
        System.out.println(climbingWaysTab(n));
    }
}
