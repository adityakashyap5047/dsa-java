import java.util.Scanner;

public class ClearLastIBits {
    public static int clearBits(int n, int i){
        int bitMask = ((~0) << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the ith number : ");
        int i = sc.nextInt();
        System.out.println("After clearing tii "+i+"th bit of  number "+number+" it will be : "+clearBits(number, i));
    }
        
}
