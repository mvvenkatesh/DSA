public class Math {
    public static void main(String[] args) {

//        int n = 30;
//        boolean a[] = new boolean[n+1];
//        for(int i=0;i<=30;i++){
//            if(prime(i)) {
//                System.out.println(i);
//            }
//        }
        System.out.println(lcm(4,9));
    }

    public static double sqrt(int n){
        double root = 0.0;
        int start = 0;
        int end = n;

        while (start <= end){
            int mid = start+(end-start)/2;
            if(mid*mid > n){
                end = mid-1;
            }
            else if(mid*mid < n){
                start = mid+1;
                root = mid;
            }
            else {
                return mid;
            }
        }
        double inc = 0.1;
        for(int i=0;i<3;i++){
            while (root*root <=n){
                root += inc;
            }
            root -= inc;
            inc = inc/10;
        }

        return root;
    }

    public static boolean prime(int n){
        if (n <= 1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void prime(int n,boolean[] a){

        for (int i=2;i*i<=n;i++){
            if(!a[i]){
                for (int j=i*2;j<=n;j+=i){
                    a[j] = true;
                }
            }
        }

        for(int i=0;i<=n;i++){
            if(a[i] == false){
                System.out.println(i);
            }
        }

    }

    public static int gcd(int a ,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    public static int lcm(int a ,int b){
        return (a*b)/gcd(a,b);
    }
}
