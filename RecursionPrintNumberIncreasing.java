public class RecursionPrintNumberIncreasing {
    public static void printNumber(int n){
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNumber(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        printNumber(10);
    }
}
