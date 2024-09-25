import java.util.*;

public class Pattern8 {

    public static void invetedPyramid2(int rows){
        for(int i = 1; i <= rows; i++){
            int number = 1;
            for(int j = 1; j <= (rows-i+1); j++){
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
        invetedPyramid2(rows);
    }
}
