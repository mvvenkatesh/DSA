import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int a[] = {5,4,3,9,1};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }

    public static void quickSort(int a[],int low,int high){
        if(low >= high){
            return;
        }
        int mid = low + (high-low)/2;
        int i = low;
        int j = high;
        int pivot = a[mid];

        while (i<=j){
            while (a[i] < pivot){
                i++;
            }
            while (a[j]>pivot){
                j--;
            }
            if(i<=j){
                swap(a,i,j);
                i++;
                j--;
            }
        }
        quickSort(a,low,j);
        quickSort(a,i,high);
    }

    public static void swap(int a[], int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void mergeSort(int a[],int start,int end){
        if(start==end){
            return;
        }
        int mid = start + (end-start)/2;
        mergeSort(a,start,mid);
        mergeSort(a,mid+1,end);
        merge(a,start,mid,end);
    }
    public static void merge(int a[],int start,int mid, int end){
        int temp[] = new int[end-start+1];
        int i=start;
        int j=mid+1 ;
        int k=0;

        while(i<=mid && j<=end){
            if(a[i]<a[j]){
              temp[k++] = a[i];
              i++;
            }
            else{
                temp[k++] = a[j];
                j++;
            }
        }

        while (i<=mid){
            temp[k++] = a[i];
            i++;
        }
        while (j<=end){
            temp[k++] = a[j];
            j++;
        }

        for (int l = 0; l < temp.length; l++) {
            a[start + l] = temp[l];
        }
    }
}
