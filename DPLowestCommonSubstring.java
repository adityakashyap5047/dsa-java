public class DPLowestCommonSubstring {
    
    public static int lcs(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        int max = Integer.MIN_VALUE;

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
                    dp[i][j] = 0;
                }
                max = Math.max(max, dp[i][j]);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";
        System.out.println(lcs(str1, str2));
    }
}
