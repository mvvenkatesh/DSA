import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        ArrayList<String> res=subseqRet("","abc");
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }

//        int a[] = {1,2,2};
//        List<List<Integer>> l = subsetDuplicates(a);
//        for(int i=0;i<l.size();i++){
//            List<Integer> list = l.get(i);
//            System.out.println(list);
//
//        }


    }

    public static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
         char c = up.charAt(0);
        subseq(p+c,up.substring(1));
        subseq(p,up.substring(1));
    }
    public static ArrayList<String> subseqRet(String p, String up){
        ArrayList<String> list = new ArrayList<String>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        list.addAll(subseqRet(p+c,up.substring(1)));
        list.addAll(subseqRet(p,up.substring(1)));
        return list;
    }

    public static List<List<Integer>> subset(int a[]){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : a){
            int n = outer.size();

            for(int i=0;i<n;i++){
                List<Integer> inner = new ArrayList<Integer>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
    public static List<List<Integer>> subsetDuplicates(int a[]){
        Arrays.sort(a);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i=0;i<a.length;i++){
            start = 0;
            int n = outer.size();
            if(i>0 && a[i] == a[i-1]){
                start = end;
            }
            end = outer.size();
            for(int j=start;j<n;j++){
                List<Integer> inner = new ArrayList<Integer>(outer.get(j));
                inner.add(a[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
