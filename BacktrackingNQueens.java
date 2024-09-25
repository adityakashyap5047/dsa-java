import java.util.*;

public class BacktrackingNQueens {

    /*
     * Time complexity:
     * 
     *          Without condition -> n^n
     *          With condition    -> n!
     * 
     */

    public static void nQueens(char board[][], int row){
        //base case
        if(row == board.length){
            printBoard(board);
            return;
        }

        //column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1);  //function call
                board[row][j] = 'X';    //backtracking step
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i = row; i > 0; i --){
            if(board[i-1][col] == 'Q'){
                return false;
            }
        }

        //right diagonal
        for(int i = row, j = col; i > 0 && j < board[0].length - 1; i--, j++ ){
            if(board[i-1][j+1] == 'Q'){
                return false;
            }
        }

        //left diagonal
        for(int i = row, j = col; i > 0 && j > 0; i --, j--){
            if(board[i-1][j-1] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("*********************************");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of number of rows: ");
        int n = sc.nextInt();
        char board[][] = new char[n][n];

        //Initialize the board
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'X';
            }
        }

        System.out.println("All possible solution of the placing the Queens is following: ");
        nQueens(board, 0);
    }
}