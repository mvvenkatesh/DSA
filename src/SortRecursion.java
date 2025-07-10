import java.util.Arrays;

public class SortRecursion {
    public static void main(String[] args) {
        int a[] = {4,3,2,1};
        int l = a.length;
        selectionSort(a,l,0,0);
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSort(int[] a, int r, int c) {
        if(r==0){
            return;
        }
        if(c<r){
            if(a[c]>a[c+1]){
                int temp = a[c];
                a[c] = a[c+1];
                a[c+1] = temp;
            }
            bubbleSort(a,r,c+1);
        }
        else{
            bubbleSort(a,r-1,0);
        }
    }

    public static void selectionSort(int a[],int r,int c,int max){

        if(r==0){
            return;
        }

        if(c<r){
            if(a[c]>a[max]){
                max=c;
            }
            selectionSort(a,r,c+1,max);
        }
        else{

            int temp = a[max];
            a[max] = a[r-1];
            a[r-1] = temp;
            selectionSort(a,r-1,0,0);
        }


    }

}
