import java.util.*;
class sumOfN_Numbers {

    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum =0;
        for (int i=0;i<=n;i++)
        {
            sum+=i;
        }
        System.out.print("Sum of first {n} natiural numbers is "+sum);
        sc.close();
    }
    
}
