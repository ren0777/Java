/*Print a solid rhombus.
    ****
   ****
  ****
 **** 

 */
package patterns;   
class Rhombus {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) { //i=1;i<=n;i++
            //spaces
            for (int j = 1; j <= i - 1; j++) {//j=1;j<=n-i;j++
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
