public class FindingIndexInInfiniteArray {


    public int ans(int a[],int target){

        int start = 0;
        int end = 1;

        while(target > a[end]){
            int newStart = end+1;
            end = end+ (end-start+1)*2;
            start = newStart;
        }
        return binarySearch(a,target,start,end);

    }

    public int binarySearch(int a[],int target,int start, int end){

        while(start <= end){
            int mid = start +(end-start)/2;
            if(target > a[mid]){
                start = mid+1;
            }
            else if(target < a[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
}
