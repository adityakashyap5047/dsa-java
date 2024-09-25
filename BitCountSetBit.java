import java.util.*;

public class BitCountSetBit {
    public static int countSetBit(int n){ //O(log n)
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = (n >> 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The total number of Set Bit in the number "+n+" is : "+countSetBit(n));
    }
}
