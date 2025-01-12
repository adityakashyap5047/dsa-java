public class DPMountainRanges {

    public static int mountainValleysCount(int n){
        int dp[] = new int[n+1];

        dp[0] = dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                int inside = dp[j];
                int outside = dp[i-1-j];
                dp[i] += inside*outside;
            }
        }

        return dp[n];
    }
    
    public static void main(String[] args) {
        int pairs = 3;

        System.out.println(mountainValleysCount(pairs));
    }
}
