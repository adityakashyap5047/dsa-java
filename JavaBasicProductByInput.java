import java.util.*;

public class JavaBasicProductByInput{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();

        int product = a*b;

        System.out.println("The Product of "+a+" and "+b+" is "+product);
    }
}