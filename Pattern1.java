import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows / columns:");
        int number = sc.nextInt();

        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                System.out.print('*'+" ");
            }
            System.out.println("");
        }
    }
}
