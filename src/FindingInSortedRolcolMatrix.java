public class FindingInSortedRolcolMatrix {

    public int[] find(int[][] a,int target){

        int row = 0;
        int col = a.length-1;

        while(row<a.length && col>=0){
            if(a[row][col] == target){
                return new int[]{row,col};
            }
            else if(a[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
