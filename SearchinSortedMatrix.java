public class SearchinSortedMatrix {
    public static boolean binary(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start+end)/2;
            if (key == arr[mid]) {
                System.out.println("found");
                return true;
            }
            else if (key < arr[mid]) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }   
        return false;
    }
    public static boolean binarySearch(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            binary(matrix[i], key);
        }
        return false;
    }
    public static boolean staircaseSearchTop(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1; 

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found at ("+row+", "+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static boolean staircaseSearchBottom(int matrix[][], int key){
        int row = matrix.length-1, col = 0; 

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("found at ("+row+", "+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        
        staircaseSearchTop(matrix, 39);
        staircaseSearchBottom(matrix, 33);
        binarySearch(matrix, 39);
        binarySearch(matrix, 33);

    }
}
