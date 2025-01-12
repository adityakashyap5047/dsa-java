import java.util.Arrays;

public class DPMatrixChainMultiplication {

    public static int mcm(int arr[], int i, int j){
        if (i == j) {
            return 0;
        }

        int minCost = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k+1, j);
            int cost3 = arr[i-1]*arr[k]*arr[j];

            int finalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, finalCost);
        }

        return minCost;
    }

    public static int mcmMem(int arr[], int i, int j, int dp[][]){
        if (i == j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }        

        int minCost = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int cost1 = mcmMem(arr, i, k, dp);
            int cost2 = mcmMem(arr, k+1, j, dp);
            int cost3 = arr[i-1]*arr[k]*arr[j];

            int finalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, finalCost);
        }

        return dp[i][j] = minCost;
    }
    
    public static void main(String[] args) {
        //recursion
        int arr[] = {1, 2, 3, 4, 3};
        System.out.println(mcm(arr, 1, arr.length-1));

        //memoization
        int dp[][] = new int[arr.length][arr.length];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcmMem(arr, 1, arr.length-1, dp));
    }
}
