import java.util.*;

public class BitGetIthBit {
    public static int getIthBit(int number, int i){
        int bitMask = (1<<i);
        if ((number & bitMask) == 0) {
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the ith number : ");
        int i = sc.nextInt();
        System.out.println("The "+i+"th bit of  number "+number+" is : "+getIthBit(number, i));
    }
}
