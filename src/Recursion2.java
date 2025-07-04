public class Recursion2 {
    public static void main(String[] args) {

        int a[] = {5,6,7,8,9,1,2,3};
        System.out.println(rotatedBinarySearch(a,3));

    }

    public static boolean sorted(int a[]){
        return helper(a,0);
    }
    private static boolean helper(int[] a, int i) {
        if(a.length-1 == i){
            return true;
        }
        if(a[i] < a[i+1]){
            return helper(a,++i);
        }
        else {
            return false;
        }
    }

    public static int linearSearch(int a[],int target,int i){
        if(a.length==i){
            return -1;
        }
        if(a[i]==target){
            return i;
        }
        return linearSearch(a,target,++i);
    }

    public static int rotatedBinarySearch(int a[],int target){
        return helper1(a,target,0,a.length-1);
    }

    private static int helper1(int[] a, int target, int s, int e) {
        if(s>e){
            return -1;
        }
        int mid= s+(e-s)/2;

        if(target==a[mid]){
            return mid;
        }

        if(a[s]<=a[mid]){
            if(target>=a[s] && target < a[mid]){
                e = mid-1;
                return helper1(a,target,s,e);
            }
            else{
                s = mid+1;
                return helper1(a,target,s,e);
            }
        }
        else{
            if(target>a[mid] && target <= a[e]){
                s=mid+1;
                return helper1(a,target,s,e);
            }
            else{
                e=mid-1;
                return helper1(a,target,s,e);
            }
        }
    }

    public static int findPivot(int a[],int s,int e){
        if(s>e){
            return s;
        }
        int mid = s+(e-s)/2;

        if (mid < e && a[mid] > a[mid + 1]) {
            return mid + 1;
        }

        // Check if mid-1 is pivot
        if (mid > s && a[mid] < a[mid - 1]) {
            return mid;
        }

        if(a[s] < a[mid]){
            s=mid+1;
            return findPivot(a,s,e);
        }
        else{
            e=mid-1;
            return findPivot(a,s,e);
        }


    }
}
