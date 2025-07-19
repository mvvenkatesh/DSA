import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

//        if (sudoku(board)) {
//            print(board);
//        } else {
//            System.out.println("Cannot solve");
//        }
        List<int[][]> s = new ArrayList<int[][]>();
        allSol(board,s);


        for(int[][] a : s){
            print(a);
        }


    }

    public static boolean sudoku(int[][] board){
        int row = -1;
        int col = -1;

        boolean emptyLeft = false;
        for(int i = 0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft =true;
                    break;
                }
            }
            if(emptyLeft){
                break;
            }
        }
        if(emptyLeft == false){
            //Solved
            return true;
        }

        for(int i=1;i<=9;i++){
            if(isSafe(board,row,col,i)){
                board[row][col] = i;
                if(sudoku(board)){
                    return true;
                }else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] board,int row,int col,int num){
        //Check rows and columns
        for(int i=0;i<board.length;i++){
            if(board[row][i] == num || board[i][col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rStart = row - row%sqrt;
        int cStart = col - col%sqrt;
        for (int i=rStart;i<rStart+sqrt;i++){
            for(int j= cStart;j<cStart+sqrt;j++){
               if( board[i][j] == num){
                   return false;
               }
            }
        }

        return true;
    }
    public static void print(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void allSol(int[][] board, List<int[][]> sol){
        int row = -1;
        int col = -1;
        boolean emptyLeft = false;

        for (int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft = true;
                    break;
                }
            }
            if(emptyLeft){
                break;
            }
        }

        if(emptyLeft==false){
            int[][] res = new int[board.length][];
            for (int i = 0; i < board.length; i++) {
                res[i] = board[i].clone();
            }
            sol.add(res);
            return;
        }

        for(int i=1;i<=board.length;i++){
            if(isSafe(board,row,col,i)){
                board[row][col] = i;
                allSol(board,sol);
                board[row][col] = 0;
            }
        }

    }
}
