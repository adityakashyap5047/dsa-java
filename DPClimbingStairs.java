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
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbingWays(n));

        int dp[] = new int[n+1];
        System.out.println(climbingWaysMem(n, dp));
    }
}
