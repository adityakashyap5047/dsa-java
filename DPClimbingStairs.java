public class DPClimbingStairs {

    public static int climbingWays(int n){
        if (n == 0 || n == 1) {
            return 1;
        } 
        return climbingWays(n-1) + climbingWays(n-2);
    }

    public static int climbingWaysMem(int n, int dp[]){
        if (n == 0 || n == 1) {
            return 1;
        } 

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = climbingWaysMem(n - 1, dp) + climbingWaysMem(n - 2, dp);
        return dp[n];
    }

    public static int climbingWaysTab(int n){
        int dp[] = new int[n+1];

        //initialize
        dp[0] = 1;
        dp[1] = 1;

        //meaning -> climb(n) = dp[n]

        //filling
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 5;

        //T.C - (2^n)
        
        //recursion
        System.out.println(climbingWays(n));

        //T.C - O(n)

        //memoization
        int dp[] = new int[n+1];
        System.out.println(climbingWaysMem(n, dp));

        //tabulation
        System.out.println(climbingWaysTab(n));

        //To initialize an array with a specific value we can
        // Arrays.fill(array_name, value);
    }
}
