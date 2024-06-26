import java.util.*;

public class even {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter number to be check");
        int n1=sc.nextInt();
        if(n1%2==0){
            System.out.println("even");
         }  
        else{
            System.out.println("odd");
        }sc.close();
    }
    
}
