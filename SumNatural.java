import java.util.*;

public class SumNatural {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        while (count <= n) {
            sum += count;
            count += 1;
        }
        System.out.println("The sum of 1st "+n+" Natural number is "+sum);

    }
}
