import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {

//        permutations("","ab");
        ArrayList<String> ans = permutations1("", "ab");
        System.out.println(ans);

    }
    public static void permutations(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        for (int i=0 ; i<=p.length();i++){

            String f = p.substring(0,i);
            String l = p.substring(i);
            permutations(f+c+l,up.substring(1));
        }

    }
    public static ArrayList<String> permutations1(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        char c = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i=0 ; i<=p.length();i++){

            String f = p.substring(0,i);
            String l = p.substring(i);
            ans.addAll(permutations1(f+c+l,up.substring(1)));
        }
        return ans;
    }
}
