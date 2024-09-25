import java.util.*;

public class BitFastExponent {
    public static int fastExponent(int a, int n){
        int ans = 1;

        while (n > 0){
            if((n & 1) == 1) { //check LSB
                ans = ans * a;
            }
            a = a * a;
            n = (n>>1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int a = sc.nextInt();
        System.out.println("Enter the power : ");
        int n = sc.nextInt();
        System.out.println(a+" to the power "+n+" is : "+fastExponent(a, n));
    }
}
