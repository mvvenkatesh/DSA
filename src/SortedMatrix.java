import java.util.Arrays;

public class SortedMatrix {

    public static void main(String[] args){
        int a[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(Arrays.toString(find(a,3)));

    }


    public static int[] binarySearch(int a[][],int start,int end, int row,int target){

        while(start <= end){
            int mid = start+(end-start)/2;

            if(a[row][mid] < target){
                start = mid+1;
            }
            else if(a[row][mid] > target){
                end = mid-1;
            }
            else{
                return new int[]{row,mid};
            }
        }

        return new int[]{-1,-1};
    }

    public static int[] find(int a[][],int target){
        int cols = a[0].length;
        int rows = a.length;
        if (cols == 0){
            return new int[] {-1,-1};
        }
        int rstart = 0;
        int rend = a.length-1;
        int cmid = cols/2;
        while(rstart < (rend-1)){
            int mid = rstart + (rend-rstart)/2;
            if(a[mid][cmid] == target){
                return new int[]{mid,cmid};
            }
            else if(a[mid][cmid] < target){
                rstart = mid;
            }
            else{
                rend = mid;
            }
        }

        if(a[rstart][cmid] == target){
            return new int[]{rstart,cmid};
        }
        if(a[rstart+1][cmid] == target){
            return new int[]{rstart,cmid};
        }

        //1st
        if(target <= a[rstart][cmid-1]){
            return binarySearch(a,0,cmid-1,rstart,target);
        }
        else if( target <= a[rstart+1][cmid-1] ){
            return binarySearch(a,0,cmid-1,rstart+1,target);
        }
        else if( target >= a[rstart+1][cmid+1] ){
            return binarySearch(a,cmid+1,cols-1,rstart+1,target);
        }
        else{
            return binarySearch(a,cmid+1,cols-1,rstart,target);
        }


    }
}
