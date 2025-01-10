public class DPFibonacci{

    public static int fib(int n){       // T.C - O(2^n)
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    public static int dpFib(int n, int fibn[]){     // T.C - O(n)

        if (n == 0 || n == 1) {
            return n;
        }

        if (fibn[n] != 0) {
            return fibn[n];
        }

        fibn[n] = dpFib(n-1, fibn) + dpFib(n-2, fibn);
        return fibn[n];
    }

    public static int fibTabulation(int n){     // T.C - O(n)
        int dp[] = new int[n+1];

        //initialize
        dp[0] = 0;
        dp[1] = 1;

        //meaning -> fib(n) = dp[n]

        //filling
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));

        int fibn[] = new int[n+1];
        System.out.println(dpFib(n, fibn));
        System.out.println(fibTabulation(n));
    }
}