import java.util.*;

public class BinarytoDecimal {
    public static int binDec(int n) {
        int number = 0;
        int i = 0;
        if (n == 0) {
            return number;
        }
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            number += (rem * (int)(Math.pow(2, i)));
            i++;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        int number = sc.nextInt();
        System.out.println("The decimal number of "+number+" is "+binDec(number));
    }
}