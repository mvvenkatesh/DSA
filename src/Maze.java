public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("",3,3);
    }

    public static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r,c-1);

        return left+right;
    }
    public static void path(String p,int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path("D"+p,r-1,c);
        }
        if(c>1) {
            path("R" + p, r, c - 1);
        }
    }
}
