public class RecursionSumNatural {
    public static int sumNatural(int n){  //Time complexity O(n)
                                          //Space complexity O(n) , since in call stack there creates n call frames
        if (n == 1) {
            return 1;
        }
        return n+sumNatural(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumNatural(10));
    }
}
