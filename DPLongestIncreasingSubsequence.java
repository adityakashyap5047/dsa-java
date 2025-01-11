// import java.util.Arrays;

import java.util.TreeSet;

public class DPLongestIncreasingSubsequence {

    public static int lis(int numbers[], int sortedNumbers[]){
        int n = numbers.length;
        int m = sortedNumbers.length;

        int dp[][] = new int[n+1][m+1];

        //initialization
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        //filling
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (numbers[i-1] == sortedNumbers[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]); 
                }
            }
        }

        return dp[n][m];
    }
    
    public static void main(String[] args) {
        int numbers[] = {50, 3, 10, 7, 40, 80};
        // int sortedNumbers[] = Arrays.copyOf(numbers, numbers.length);        // here we will not use this method for sorting because it also sorts duplicate value but lis exists only for unique value so for duplicate value we need to convert it into unique values
        // Arrays.sort(sortedNumbers);

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }

        int sortedNumbers[] = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            sortedNumbers[idx] = num;
            idx++;
        }

        System.out.println(lis(numbers, sortedNumbers));
    }
}
