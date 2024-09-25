import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number the rows: ");
        int number = sc.nextInt();

        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
