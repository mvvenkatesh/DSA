public class RecursionPattern {
    public static void main(String[] args) {
        pattern2(4,0);

    }

    public static void pattern(int r,int c){
        if(r==0){
            return;
        }
        if(c < r){
            System.out.print("*");
            pattern(r,++c);
        }
        else{
            System.out.println();
            pattern(--r,0);
        }

    }
    public static void pattern2(int r,int c){
        if(r==0){
            return;
        }
        if(c < r){
            pattern2(r,++c);
            System.out.print("*");
        }
        else{
            pattern2(--r,0);
            System.out.println();
        }

    }
}
