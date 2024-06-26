import java.util.*;
public class typeconversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int var=sc.nextFloat(); not allowed  implicit type conversion
       float var=sc.nextInt();
        System.out.println(var);
        sc.close();
    }
    
}
