public class BackTracking {
    public static void main(String[] args) {

        boolean a[][]= {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int b[][]= new int[a.length][a[0].length];

//        allPaths(a,"",0,0);

        allPathsMatrix(a,"",0,0,1,b);

    }
    public static void allPaths(boolean a[][],String p,int r, int c){

        if(r== a.length-1 && c == a[0].length-1){
            System.out.println(p);
            return;
        }
        if(a[r][c] == false){
            return;
        }

        a[r][c] = false;
        if(r<a.length-1){
            allPaths(a,p+"D",r+1,c);
        }
        if(c<a[0].length-1){
            allPaths(a,p+"R",r,c+1);
        }
        if(r>0){
            allPaths(a,p+"U",r-1,c);
        }
        if(c>0){
            allPaths(a,p+"L",r,c-1);
        }
        a[r][c] = true;
    }

    public static void allPathsMatrix(boolean a[][],String p,int r, int c,int count, int b[][]){

        if(r== a.length-1 && c == a[0].length-1){
            b[r][c] = count;
            for(int d[] : b){
                for(int i=0;i<d.length;i++){
                    System.out.print(d[i]);
                }
                System.out.println();
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(a[r][c] == false){
            return;
        }

        a[r][c] = false;
        b[r][c] = count;
        if(r<a.length-1){
            allPathsMatrix(a,p+"D",r+1,c,count+1,b);
        }
        if(c<a[0].length-1){
            allPathsMatrix(a,p+"R",r,c+1,count+1,b);
        }
        if(r>0){
            allPathsMatrix(a,p+"U",r-1,c,count+1,b);
        }
        if(c>0){
            allPathsMatrix(a,p+"L",r,c-1,count+1,b);
        }
        a[r][c] = true;
        b[r][c] = 0;
    }
}
