public class DPMinimumPartitioning {
    
    public static int set1Sum(int numbers[], int W){
        int n = numbers.length;
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
                int v = numbers[i-1];
                int w = v;

                if (w <= j) {
                    int incNum = v + dp[i-1][j-w];
                    int excNum = dp[i-1][j];
                    dp[i][j] = Math.max(incNum, excNum);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int numbers[] = {1, 6, 11, 5};
        
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int sum1 = set1Sum(numbers, sum/2);
        int sum2 = sum - sum1;

        int minDiff = Math.abs(sum1 - sum2);
        System.out.println("The minimum difference between two sets = "+minDiff);
    }
}
