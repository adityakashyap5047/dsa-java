import java.util.Arrays;

public class DP01Knapsack {

    public static int knapsack(int val[], int wt[], int w, int n){
        if (w == 0 || n == 0) {
            return 0;
        }

        if (wt[n-1] <= w) { // for 1st item wt will be at 0th idx
            //include
            int ans1 = val[n-1]+knapsack(val, wt, w - wt[n-1], n - 1);

            //exclude
            int ans2 = knapsack(val, wt, w, n - 1);

            return Math.max(ans1, ans2);
        } else {    // not valid
            return knapsack(val, wt, w, n - 1);
        }
    }

    public static int knapsackMem(int val[], int wt[], int w, int n, int dp[][]){   //dp[n][w]
        if (w == 0 || n == 0) {
            return 0;
        }

        if (dp[n][w] != -1) {
            return dp[n][w];
        }

        if (wt[n-1] <= w) { // for 1st item wt will be at 0th idx
            //include
            int ans1 = val[n-1]+knapsackMem(val, wt, w - wt[n-1], n - 1, dp);

            //exclude
            int ans2 = knapsackMem(val, wt, w, n - 1, dp);

            dp[n][w] = Math.max(ans1, ans2);
        } else {    // not valid
            dp[n][w] = knapsackMem(val, wt, w, n - 1, dp);
        }
        
        return dp[n][w];
    }

    public static int knapsackTab(int val[], int wt[], int n, int W){
        int dp[][] = new int[n+1][W+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = val[i-1]; //value of curr item      //(taking i-1) because, value of 1st item exist in 0 index of value array
                int w = wt[i-1];  //wt. of curr item  //(taking i-1) because, wt. of 1st exist in 0 idx of wt array

                if (w <= j) {       //valid
                    int incProfit = v + dp[i-1][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {        //invalid
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }

        return dp[n][W];
    }
    
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int w = 7;

        //Recursion

        //T.c - O(2^n)

        System.out.println(knapsack(val, wt, w, val.length));

        //T.C - O(n*w)

        //Memeoization
        int dp[][] = new int[val.length+1][w+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(knapsackMem(val, wt, w, val.length, dp));

        //Tabulation
        System.out.println(knapsackTab(val, wt, val.length, w));
    }
}
