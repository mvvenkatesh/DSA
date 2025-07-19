import java.util.ArrayList;
import java.util.List;

public class NKnights {

    public static void main(String[] args) {
        int n = 4;
        boolean board[][] = new boolean[n][n];
        List<Integer> count = new ArrayList<>();
        System.out.println(count.size());
        knight(board,0,0,n,count);
        System.out.println(count.size());
    }

    private static void knight(boolean[][] board, int row, int col, int knights,List<Integer> count) {
        if (knights == 0) {
            display(board);
            count.add(1);
            System.out.println();
            return;
        }

        if (col == board.length) {
           row =row+1;
           col = 0;
        }

        if (row == board.length) {
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1,count);
            board[row][col] = false;
        }

        knight(board, row, col + 1, knights,count);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board, row + 2, col - 1)) {
            if (board[row + 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (isValid(board, row + 2, col + 1)) {
            if (board[row + 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (isValid(board, row + 1, col - 2)) {
            if (board[row + 1][col - 2]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        if (isValid(board, row + 1, col + 2)) {
            if (board[row + 1][col + 2]) {
                return false;
            }
        }



        if (isValid(board, row + 1, col + 2)) {
            if (board[row + 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    // do not repeat yourself, hence created this function
    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }


    private static void display(boolean[][] board) {
        for(boolean a[] : board){
            for(int i=0;i<a.length;i++){
                if(a[i]){
                    System.out.print("K");
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
