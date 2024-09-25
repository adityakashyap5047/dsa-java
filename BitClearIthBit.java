import java.util.*;

public class BitClearIthBit {
    public static int clearIthBit(int number, int i){
        int bitMask = ~(1<<i);
        return number & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the ith number : ");
        int i = sc.nextInt();
        System.out.println("After clearing the "+i+"th bit of  number "+number+" it will be : "+clearIthBit(number, i));
    }
}
