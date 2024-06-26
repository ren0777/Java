/*  1        row 1   1to1
    12       row 2   1to2
    123
    1234
    12345
 
 */

package patterns;

public class p6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
