import java.util.*;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number "+number+" is an Even number");
        }
        else{
            System.out.println("The number "+number+" is an Odd number");
        }
    }
}
