import java.util.*;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        String OddEven = (number % 2 == 0) ? "The entered number is an Even number" : "The entered number is an Odd number";
        System.out.println(OddEven);
    }
}
