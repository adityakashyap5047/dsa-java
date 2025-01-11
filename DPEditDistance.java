public class DPEditDistance {

    public static int editDistance(String word1, String word2){
        int n = word1.length();
        int m = word2.length();

        int dp[][] = new int[n+1][m+1];
        
        //initialization
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i < m+1; i++) {
            dp[0][i] = i;
        }

        //filling
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else{
                    int ans1 = dp[i][j-1] + 1;  //adding character into word1 //here when we insert a character into str1, we are trying to match the j-th character of str2 with the next character in str1 therefore the remaining unmatched string is dp[i][j-1]
                    int ans2 = dp[i-1][j] + 1;  //deleting character from word2
                    int ans3 = dp[i-1][j-1] + 1;    //replacing the character from word1 and word2
                    dp[i][j] = Math.min(Math.min(ans1, ans2), ans3);
                }
            }
        }

        return dp[n][m];
    }
    
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        System.out.println(editDistance(word1, word2));
    }
}
