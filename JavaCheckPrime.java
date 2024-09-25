import java.util.*;

public class JavaCheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Method 1 

        System.out.println("Enter the number:");
        int number = sc.nextInt();
        boolean isPrime = true;

        if (number == 2) {
            System.out.println("prime");
        }else{
            for(int div = 2; div <= (number - 1); div++) {
                if(number % div == 0){
                    isPrime = false;
                }
            } 

            if (isPrime) {
                System.out.println("prime");
            }
            else{
                System.out.println("not a prime");
            }
        }

        //Method 2

        System.out.println("Enter the number:");
        number = sc.nextInt();
        isPrime = true;

        if (number == 2) {
            System.out.println("prime");
        }else{
            for(int div = 2; div <= Math.sqrt(number); div++) {
                if(number % div == 0){
                    isPrime = false;
                }
            } 

            if (isPrime) {
                System.out.println("prime");
            }
            else{
                System.out.println("not a prime");
            }
        }
    }
}
