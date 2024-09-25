import java.util.Scanner;

public class BitClearRanges {
    public static int clearRangesBits(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i-1);
        int bitMask = a|b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the ith number : ");
        int i = sc.nextInt();
        System.out.print("Enter the jth number : ");
        int j = sc.nextInt();
        System.out.println("After clearing the bit from "+i+"th to "+j+"th  of  number "+number+" it will be : "+clearRangesBits(number, i, j));
    }
    
}
