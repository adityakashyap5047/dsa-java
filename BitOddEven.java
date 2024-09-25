import java.util.*;

public class BitOddEven {
    public static void OddEven(int number){
        int bitMask = 1;
        if ((number & 1) == bitMask) {
            System.out.println("The given number "+number+" is an Odd Number");
        }else{
            System.out.println("The given number "+number+" is an Even Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        OddEven(number);
    }
}
