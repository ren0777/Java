/* ___* 3 spce+1 star=4  space =n-i    n=4
   __** 2 space+2star=4
   _*** 1 space+3star=4
   **** 0 space+4star=4
 */
package patterns;

public class p5 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
