import java.util.*;

public class FactorialByFunction {

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        int fact = factorial(number);
        System.out.println("The factorial of "+number+" is "+fact);

    }
}
