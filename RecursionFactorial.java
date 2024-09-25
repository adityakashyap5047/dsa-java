public class RecursionFactorial {
    public static int calcFactorial(int n){   //Time complexity O(n)
                                              //Space complexity O(n) , since in call stack there creates n call frames
        if (n == 0) {
            return 1;
        }
        return n*calcFactorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(calcFactorial(5));
    }
}
