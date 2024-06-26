package functions;

public class PrimeRange {
    public static void primerange(int n) {
        for (int i=2;i<=n;i++){
            if(prime.isPrimeOptimize(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        primerange(20);
    }


    
}
