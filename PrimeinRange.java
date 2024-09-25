import java.util.*;

public class PrimeinRange {

    public static boolean prime(int n){
        if(n == 2){
            return true;
        }
        for(int div=2; div <= Math.sqrt(n); div++){
            if (n % div == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        for(int i = 2; i <= number; i++){
            if (prime(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
