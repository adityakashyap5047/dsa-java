import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number the rows: ");
        int number = sc.nextInt();

        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= (number - i + 1); j++){
                System.out.print('*'+" ");
            }
            System.out.println(" ");
        }
    }
}
 
