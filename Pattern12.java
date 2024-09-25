import java.util.*;

public class Pattern12 {

    public static void solidRhombous(int rows){
        for(int i = 1; i<=rows; i++){
            for(int j=1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j <= rows; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }     
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        solidRhombous(rows);
    }
}

