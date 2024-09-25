import java.util.Scanner;

public class DecimaltoBinary {

    public static int decBin(int n){
        int i = 0;
        int number = 0;
        while (n > 0) {
            int rem = n%2;
            n = n/2;
            number += (rem * (int)(Math.pow(10, i)));
            i++;
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int number = sc.nextInt();
        System.out.println("The binary number of "+number+" is "+decBin(number));
    }
}
