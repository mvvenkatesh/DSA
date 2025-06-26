import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int a[] = {-1,7,-32,0,89};

        int b[] = {3,5,2,1,4};

        System.out.println(Arrays.toString(cyclicSort(b)));

    }

    public static int[] cyclicSort(int a[]){
        int i = 0;
        while(i<a.length){
            int correct = a[i]-1;
            if(a[correct] == a[i]){
                i++;
            }
            else{
                int temp = a[correct];
                a[correct]=a[i];
                a[i] = temp;
            }

        }
        return a;
    }
    public static int[] insertionSort(int[] a){

        for(int i=0;i<a.length-1;i++){
            int j=i+1;
            while(j>0){
                if(a[j-1]>a[j]){
                    int temp = a[j-1];
                    a[j-1]=a[j];
                    a[j] = temp;
                    j--;
                }
                else{
                    break;
                }
            }
        }
        return a;
    }
    public static int[] selectionSort(int[] a){

        for(int i=0;i<a.length;i++){
            int max = 0;
            for(int j=0;j<a.length-i;j++){
                if(a[j]>a[max]){
                    max =j;
                }
            }

            int temp = a[a.length-i-1];
            a[a.length-i-1] = a[max];
            a[max] = temp;

        }
        return a;

    }
    public static int[] bubbleSort(int a[]){

        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
