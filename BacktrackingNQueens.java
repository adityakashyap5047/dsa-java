import java.util.*;

public class BacktrackingNQueens {
        /*
            Time complexity:- 

                
        */
    public static void nQueen(char board[][], int row){
        //base case
        if (row == board.length) {
            count++;
            printBoard(board);
            //System.out.println(count);
            return;
        }
        
        //column loop
        for(int j = 0; j < board[0].length; j++){
            if (checkQueen(board, row, j)) {
                board[row][j] = 'Q';
                nQueen(board, row+1);
                board[row][j] = 'X';   // backtracking step
            }
        }
    }

    public static void printBoard(char board[][]){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("*******___________*********");
    }

    public static boolean checkQueen(char board[][], int row, int column){

        //vertical up    
        for(int i = row-1; i >= 0; i--){
            if (board[i][column] == 'Q') {
                return false;
            }
        }

        // diagonal left
        for(int i = row-1, j = column-1; i >= 0 && j >= 0; i--, j--){
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right
        for(int i = row-1, j = column+1; i >= 0 && j < board.length; i--, j++){
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static int count = 0;

    public static boolean nQueen1Sol(char board[][], int row){
        // base case
        if (row == board.length) {
            return true;
        }

        // column loop
        for(int j = 0; j < board[0].length; j ++){
            if(checkQueen(board, row, j)){
                board[row][j] = 'Q';
                if(nQueen1Sol(board, row+1)){
                    return true;
                }
                board[row][j] = 'X';   // backtracking step
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of size of chess board : ");
        int n = sc.nextInt();

        char board[][] = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'X';
            }
        }

        //nQueen(board, 0);

        //System.out.println("The required number of ways for placing the queen is : "+count);


        if (nQueen1Sol(board, 0)) {
            System.out.println("solution is possible");
            printBoard(board);
        }
        else{
            System.out.println("solution is not possible");
        }
    }
}