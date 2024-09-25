import java.util.*;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:"); 
        int number = sc.nextInt();
        int rev = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            rev = (rev * 10) + lastDigit;
        }
        System.out.println("The reverse of "+number+" is "+rev);
    }
}
