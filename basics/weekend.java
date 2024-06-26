package basics;
import java.util.*;
public class weekend {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int day=sc.nextInt();

    switch(day){
        case 1,2,3,4,5: {System.out.println("Weekday");break;}
        case 6,7:{System.out.println("weekend");break;} 
        default:System.out.println("invalid choice");
    }    
    sc.close();
    }
    
}

