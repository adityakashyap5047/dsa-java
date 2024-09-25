import java.util.*;

public class ProductByFunction {

    public static int calculateProduct(int a, int b){
        int product = a*b;
        return product;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the 1st number:");
        int num2 = sc.nextInt();

        int product = calculateProduct(num1, num2);
        System.out.println("The Product of "+num1+" and "+num2+" is "+product);
    }
}
