public class BinarySearch {
    public static int binarySearch(int a[], int target){

        boolean isAsc = a[0]<a[a.length-1];
        System.out.println(isAsc);
        int start = 0;
        int end = a.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;

            if(a[mid]==target){
                return mid;
            }
            if(isAsc){
                if(a[mid]>target){
                    end = mid-1;
                }
                else if(a[mid]<target){
                    start = mid+1;
                }
            }
            else {
                if (a[mid] > target) {
                    start = mid + 1;
                } else if (a[mid] < target) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
