public class DPWildCardMatching {

    public static boolean wildCard(String s, String p){
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n+1][m+1];

        //initialize
        for(int i = 0; i < n+1; i++){
            for (int j = 0; j < m+1; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i != 0 && j  == 0) {
                    dp[i][j] = false;
                } else if (i == 0 && j != 0 && (p.charAt(j-1) != '*')) {    //jth character at (j-1) index
                    dp[i][j] = false;
                } else if (i == 0 && j != 0 && (p.charAt(j-1) == '*')) {
                    dp[i][j] = dp[0][j-1];
                }
            }
        }

        //filling
        for (int i = 1; i < n+1; i++) {
            for(int j = 1; j < m+1; j++){ // if last character of both string and pattern matches or last character of pattern is '?'
                if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                } else if (p.charAt(j-1) == '*') {  // if last character of pattern is '*' then we ignore the '*' or replace the '*' with last character of string
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[n][m];
    }
    
    public static void main(String[] args) {
        String s = "baaabab";
        String p = "*****ba*****abc";
        
        System.out.println(wildCard(s, p));
    }
}
