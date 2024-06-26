/*Print if a number n is prime or not (Input n from the user). 
[In this problem you will learn how to check if a number is prime or not]*/

import java.util.*;


public class prime {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();


       boolean isPrime = true;
       for(int i=2; i<=n/2; i++) {    //or root n reduces time complexity 
           if(n % i == 0) {
               isPrime = false;
               break;
           }
       }


       if(isPrime) {
           if(n == 1) {
               System.out.println("This is neither prime not composite");
           } else {
               System.out.println("This is a prime number");
           }
       } else {
           System.out.println("This is not a prime number");
       }
       sc.close();
       
   }   
}
