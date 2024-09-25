import java.util.*;

public class BinomialCoefficient {

    public static int factorial(int n){
        int facto = 1;
        if(n == 0){
            return 1;
        }else{
            for(int i =1; i <= n; i++){
                facto *= i;
            }
            return facto;    
        }
    }

    public static int binoCoeff(int n, int r){
        int result = factorial(n)/(factorial(r)*factorial(n-r));
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();
        int value = binoCoeff(n, r);
        System.out.println("The value of ("+n+", "+r+") is "+value);
    }
}
