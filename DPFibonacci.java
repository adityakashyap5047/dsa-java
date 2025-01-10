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

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));

        int fibn[] = new int[n+1];
        System.out.println(dpFib(n, fibn));
    }
}