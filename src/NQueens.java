public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean board[][] = new boolean[n][n];
        nqueens(board,0);

    }
    private static void nqueens(boolean[][] board, int row) {
        if(row==board.length){
            display(board);
            return;
        }
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                nqueens(board, row+1);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //Vertical
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        //Diagonal Left
        int i = row;
        int j = col;
        while (i>=0 && j>=0){
            if( board[i][j] == true){
                return false;
            }
            i--;
            j--;
        }
        //Diagonal Right
        i = row;
        j = col;
        while (i>=0 && j<board[0].length){
            if( board[i][j] == true){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean a[] : board){
            for(int i=0;i<a.length;i++){
                if(a[i]){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
