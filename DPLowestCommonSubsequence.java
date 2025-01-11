public class DPLowestCommonSubsequence {
    
    public static int lcs(String str1, String str2, int n, int m){

        if (n == 0 || m == 0) {
            return 0;
        }
        
        if (str1.charAt(n-1) == str2.charAt(m-1)) {
            return lcs(str1, str2, n-1, m-1) + 1;
        } else {
            int ans1 = lcs(str1, str2, n-1, m);
            int ans2 = lcs(str1, str2, n, m-1);

            return Math.max(ans1, ans2);
        }
    }

    public static int lcsMem(String str1, String str2, int n, int m, int dp[][]){
        if (n == 0 || m == 0) {
            return 0;
        }

        if (dp[n][m] != 0) {
            return dp[n][m];
        }

        if (str1.charAt(n-1) == str2.charAt(m-1)) {
            dp[n][m] = lcs(str1, str2, n-1, m-1) + 1;
        } else {
            int ans1 = lcs(str1, str2, n-1, m);
            int ans2 = lcs(str1, str2, n, m-1);

            dp[n][m] = Math.max(ans1, ans2);
        }

        return dp[n][m];
    }

    public static int lcsTab(String str1, String str2, int n, int m){
        int dp[][] = new int[n+1][m+1];

        //initialize
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < m+1; j++){
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        //filling
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        System.out.println(lcs(str1, str2, str1.length(), str2.length()));

        //memoization
        int dp[][] = new int[str1.length()+1][str2.length()+1]; // 0 to n -> n+1 numbers
        System.out.println(lcsMem(str1, str2, str1.length(), str2.length(), dp));

        //Tabulation
        System.out.println(lcsTab(str1, str2, str1.length(), str2.length()));
    }
}
