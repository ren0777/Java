/* |*****|   1
   |*   *|   2
   |*   *|   3
   |*****|   4
  j=12345
   */

package patterns;
import java.util.*;
class p2 
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=4;
      int m=5;
        for(int i=1;i<=n;i++){
          
          for(int j=1;j<=m;j++){
            if(i==1 || j==1 || i==n || j==m ){
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
          
        }
        System.out.println();
      }sc.close();
    }

    
}
