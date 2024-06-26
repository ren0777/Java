package basics;
import java.util.*;
public class FizzBuzz {/*no. multiple of 3= fizz
                        no. multiple of 5= buzz
                        no. multiple of 3 & 5 =fizzbuzz*/
    
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0 && n%5==0){ //15
            System.out.println("Fizz Buzz");
        }
        else if(n%5==0){
            System.out.println("Buzz");
        }
        else if(n%3==0){
            System.out.println("Fizz");
        }
        else{System.out.println(n);}
        sc.close();
    }
}
