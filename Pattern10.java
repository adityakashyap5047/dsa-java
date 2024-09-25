import java.util.*;

public class Pattern10 {

    public static void triangle01(int rows){
        for(int i = 1; i <= rows; i++){
            int number = 1;
            if(i % 2 == 0){
                number = 0;
            }
            for(int j = 1; j <= i; j++){
                System.out.print(number+" ");
                if (number != 1) {
                    number = 1;
                }
                else{
                    number = 0;
                }
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if ((i+j)%2 == 0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        triangle01(rows);
        zero_one_triangle(rows);
    }
}
