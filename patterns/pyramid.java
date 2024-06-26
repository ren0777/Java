/*   Print a number pyramid.
       1
      2 2
     3 3 3
    4 4 4 4
   5 5 5 5 5
 
 */

package patterns;

public class pyramid {
    
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for(int j=4;j>i-1;j--){  //j=5;j>i;
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
