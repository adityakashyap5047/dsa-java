public class DPRodCutting {

    public static int rodCutting(int price[], int lenght[], int rodLength){
        int n = price.length;

        int dp[][] = new int[n+1][rodLength+1];

        //initialize
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i < rodLength+1; i++) {
            dp[0][i] = 0;
        }

        //filing
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < rodLength+1; j++) {
                int currPrice = price[i-1];
                int currLength = lenght[i-1];
                //valid
                if(currLength <= j){
                    dp[i][j] = Math.max(currPrice + dp[i][j - currLength], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][rodLength];
    }
    
    public static void main(String[] args) {
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int rodLength = 8;

        System.out.println(rodCutting(price, length, rodLength));
    }
}
