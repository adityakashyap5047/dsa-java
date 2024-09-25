public class BacktrackingNQueens {

    public static void nQueens(char board[][], int row){
        //base case
        if(row == board.length){
            printBoard(board);
            return;
        }

        //column loop
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            nQueens(board, row+1);  //function call
            board[row][j] = '.';    //backtracking step
        }
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
        
        int n = 4;
        char board[][] = new char[n][n];

        //Initialize the board
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        nQueens(board, 0);
    }
}