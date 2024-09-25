//Print numbers from n to 1 in Decreasing Order

public class RecursionPrintNumberDecreasing {

    public static void printNumber(int n){
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printNumber(n-1);
    }
    public static void main(String[] args) {
        printNumber(10);
    }
}
