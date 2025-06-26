public class Patterns {

    public static void main(String[] args){
        pattern5(4);
    }
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0 ; j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i=0;i<n*2-1;i++){
            if(i<n){
                for(int j=0 ; j<=i;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=0 ; j<=n*2-2-i;j++){
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i=0;i<n*2-1;i++){
            if(i<n){
                for(int k=0 ; k < n-1-i;k++){
                    System.out.print(" ");
                }
                for(int j=0 ; j<=i;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int k=0 ; k <= i-n;k++){
                    System.out.print(" ");
                }
                for(int j=0 ; j<=n*2-2-i;j++){
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=1;i<n*2-1;i++){
            if(i<n){
                for(int k=1 ; k < n-i;k++){
                    System.out.print(" ");
                }
                for(int j=i ; j>=1;j--){
                    System.out.print(j);
                }
                for(int j=2 ; j<=i;j++){
                    System.out.print(j);
                }
            }
            else{
                for(int k=0 ; k <= i-n;k++){
                    System.out.print(" ");
                }
                for(int j=n*2-2-i ; j>=1;j--){
                    System.out.print(j);
                }
                for(int j=2 ; j<=n*2-2-i;j++){
                    System.out.print(j);
                }

            }

            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i=1;i<n*2;i++){
            for(int j=1 ; j<n*2;j++){
                int min = n- Math.min(Math.min(i-1, j-1), Math.min(2*n-i-1, 2*n-j-1));
                System.out.print(min);
            }
            System.out.println();
        }
    }
}
