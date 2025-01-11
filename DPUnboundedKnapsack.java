public class DPUnboundedKnapsack {

    public static int unboundedKnapsack(int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < W+1; j++) {
                int v = val[i-1];
                int w = wt[i-1];

                //valid
                if (w <= j) {
                    int incProf = v + dp[i][j-w];       // for 0-1 knapsack we only use a single item once therefore instead of `v + dp[i][j-w]` we will include `v + dp[i-1][j-w]` this in our profit
                    int excProf = dp[i-1][j];

                    dp[i][j] = Math.max(incProf, excProf);
                }   // invalid
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];

    }
    
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        System.out.println(unboundedKnapsack(val, wt, W));
    }
}
