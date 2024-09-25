import java.util.*;

public class Pattern9 {

    public static void floydsTriangle(int rows){
        int number = 1;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        floydsTriangle(rows);
    }
}
