package functions;

import java.util.Scanner;

public class binomial {
     public static int fact(int n) {
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bino (int n,int r)
    {
        return fact(n)/(fact(r)*fact(n-r));

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println("binomial is "+bino(n,r));
        sc.close();
    }
}
