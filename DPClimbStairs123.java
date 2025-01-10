public class DPClimbStairs123 {
    
    public static int climbingWays(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        return climbingWays(n-1) + climbingWays(n-2) + climbingWays(n-3);
    }

    public static void main(String[] args) {
        int n = 4;

        //T.C - O(3^n);

        //recursion
        System.out.println(climbingWays(n));
    }
}
