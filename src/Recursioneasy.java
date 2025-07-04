public class Recursioneasy {
    public static void main(String[] args) {
        System.out.println(countZeroes(202100,0));
    }

    static int sum =0;
    public static void reverse(int n){
        if(n%10 == 0){
            return;
        }

        sum = sum *10+ (n%10);
        reverse(n/10);
    }

    public static int reverse1(int n){
        return helper(n,0);
    }

    private static int helper(int n, int rev) {
        if(n == 0){
            return rev;
        }
        return helper(n/10, (rev*10)+n%10);
    }

    private static void palindrome(int n){
        int rev = helper1(n,0);
        System.out.println(rev);
        if(n==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

    private static int helper1(int n,int rev) {
        if(n == 0){
            return rev;
        }
        return helper1(n/10,rev*10+(n%10));
    }

    private static int countZeroes(int n , int count){
        if(n==0){
            return count;
        }
        if(n%10 == 0){
            count++;
        }
        return countZeroes(n/10,count);

    }
}
