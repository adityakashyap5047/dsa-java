public class DPClimbingStairs {

    public static int climbingWays(int n){
        if (n == 0 || n == 1) {
            return 1;
        } 
        return climbingWays(n-1) + climbingWays(n-2);
    }

    
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbingWays(n));

    }
}
