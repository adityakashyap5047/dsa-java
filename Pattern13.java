import java.util.*;

public class Pattern13 {

    public static void hollowRhombous(int rows){
        for(int i = 1; i<=rows; i++){
            for(int j=1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j <= rows; j++){
                if ((i == 1) || (i == rows) || (j == 1) || (j == rows)) {
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }     
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        hollowRhombous(rows);
    }
}

