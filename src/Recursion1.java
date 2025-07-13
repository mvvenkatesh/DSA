public class Recursion1 {
    public static void main(String[] args) {

        System.out.println(skipApple("abbaappleabbd"));
    }

    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        if(c=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+c,up.substring(1));
        }

    }
    public static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        char c = up.charAt(0);
        if(c=='a'){
            return skip2(up.substring(1));
        }
        else{
            return c+skip2(up.substring(1));
        }
    }
    public static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            char c = up.charAt(0);
            return c+skipApple(up.substring(1));
        }

    }
}
