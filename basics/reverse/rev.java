package basics.reverse;
public class rev {
    public static void main(String[] args) {
        int n=23456;
        while(n>0)
        {
            int ld=n%10;
            System.out.print(ld);
            n=n/10;
        }
        System.out.println();
    }
}
