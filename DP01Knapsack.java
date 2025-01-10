public class DP01Knapsack {

    public static int knapsack(int val[], int wt[], int w, int n){
        if (w == 0 || n == 0) {
            return 0;
        }

        if (wt[n-1] <= w) { // for 1st item wt will be at 0th idx
            //include
            int ans1 = val[n-1]+knapsack(val, wt, w - wt[n-1], n - 1);

            //exclude
            int ans2 = knapsack(val, wt, w, n - 1);

            return Math.max(ans1, ans2);
        } else {    // not valid
            return knapsack(val, wt, w, n - 1);
        }
    }
    
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int w = 7;

        System.out.println(knapsack(val, wt, w, val.length));
    }
}
