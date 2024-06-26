import java.util.*;

public class adult {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt();
        if (age<18){
            System.out.println("not adult");
        }
        else{
            System.out.println("adult");
        }
        sc.close();
    }

    
}
