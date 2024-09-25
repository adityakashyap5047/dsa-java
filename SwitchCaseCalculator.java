import java.util.*;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator:");
        char operator = sc.next().charAt(0); 
        
        switch (operator) {
            case '+': System.out.println("The sum of "+num1+" and "+num2+" is "+(num1 + num2));
                    break;
            case '-': System.out.println("The difference of "+num1+" and "+num2+" is "+(num1-num2));
                    break;
            case '*': System.out.println("The product of "+num1+" and "+num2+" is "+(num1 * num2));
                    break;
            case '/': System.out.println("The quotient of "+num1+" divided by "+num2+" is "+(num1 / num2));
                    break;
            case '%': System.out.println("The remainder of "+num1+" divided by "+num2+" is "+(num1 % num2));
                    break;
            default: System.out.println("Please Enter the valid Operator sign");
        }
    }
}
