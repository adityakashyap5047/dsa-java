import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income:");
        long income = sc.nextLong();
        float tax;

        if (income < 500000) {
            tax = 0.00f;
            System.out.println("Your taxable amount is: "+tax);
        }
        else if (income > 500000 && income < 1000000){
            tax = income * 0.2f;
            System.out.println("Your taxable amount is: "+tax);
        }
        else if (income > 1000000){
            tax = income * 0.3f;
            System.out.println("Your taxable amount is: "+tax);
        }
    }
}
