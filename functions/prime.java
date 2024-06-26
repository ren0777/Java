package functions;

public class prime {
    public static boolean isPrime(int n) {
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
        System.out.println(isPrime(12));
        System.out.println(isPrimeOptimize(7));
    }
    public static boolean isPrimeOptimize(int n) {
        if(n==2){
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
