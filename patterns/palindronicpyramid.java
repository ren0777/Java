/* Print a palindromic number pyramid.
         1
        212
       32123
      4321234
     543212345 */

package patterns;

public class palindronicpyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j>=n-i;j++){
                System.out.println(j);

            }
        }
    }
    
}
