public class DPTargetSum {

    public static boolean isTragetSum(int numbers[], int sum){
        int n = numbers.length;

        //Tabulation

        //s1 -> initialization
        boolean dp[][] = new boolean[n+1][sum+1];

        for (int i = 0; i < n+1; i++) {
            dp[i][0] = true;
        }

        //filling
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                int v = numbers[i-1];

                //include
                if (v <= j && dp[i-1][j-v] == true) {
                    dp[i][j] = true;
                } // exclude
                else if (v <= j && dp[i-1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }

        return dp[n][sum];
    }
    
    public static void main(String[] args) {
        int numbers[] ={4, 2, 7, 1, 3};
        int sum = 10;

        System.out.println(isTragetSum(numbers, sum));
    }
}
