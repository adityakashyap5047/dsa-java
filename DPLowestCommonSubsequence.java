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

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        System.out.println(lcs(str1, str2, str1.length(), str2.length()));

        //memoization
        int dp[][] = new int[str1.length()+1][str2.length()+1];
        System.out.println(lcsMem(str1, str2, str1.length(), str2.length(), dp));
    }
}
