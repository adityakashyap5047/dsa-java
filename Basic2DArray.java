import java.util.*;

public class Basic2DArray {
    public static int max(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                largest = Math.max(largest, matrix[i][j]);
            }
        }
        return largest;
    }

    public static int min(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        return smallest;
    }

    public static boolean search(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == key) {
                    System.out.println("The element "+key+" is found at cell ("+i+", "+j+")");
                    return true;
                    
                }
            }
        }
        System.out.println("The element "+key+" is not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[4][3];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print("Enter the value of ("+(i+1)+", "+(j+1)+"): ");
                Scanner sc = new Scanner(System.in);
                matrix[i][j] = sc.nextInt();

            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 10);
        System.out.println(min(matrix));
    }

    
}