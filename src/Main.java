import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int a[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,45},
                {33,34,38,50}
        };
        FindingInSortedRolcolMatrix b = new FindingInSortedRolcolMatrix();
        int[] res = b.find(a,15);
        System.out.println(Arrays.toString(res));
    }


}