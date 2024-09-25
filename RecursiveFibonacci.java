public class RecursiveFibonacci {
    public static int printNthFibonacci(int n){  //Space complexity is O(n)
                                                 //Time compexity = exponentially = 2^(n) Because at every stack frame there will be two function call will be called.  we can reduce it time complexityto O(n) by the help of DP 
        if (n == 0 || n == 1) {
            return n;
        }
        int fibonacci_n = printNthFibonacci(n-1)+printNthFibonacci(n-2);
        return fibonacci_n;
    }
    public static void main(String[] args) {
        System.out.println(printNthFibonacci(0));
        System.out.println(printNthFibonacci(1));
        System.out.println(printNthFibonacci(2));
        System.out.println(printNthFibonacci(3));
        System.out.println(printNthFibonacci(4));
        System.out.println(printNthFibonacci(5));
        System.out.println(printNthFibonacci(6));
        System.out.println(printNthFibonacci(7));
        // System.out.println(printNthFibonacci(25));
    }
}
