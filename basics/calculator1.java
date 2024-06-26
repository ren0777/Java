package basics;

import java.util.Scanner;

public class calculator1 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a:");
            int a=sc.nextInt();
            System.out.println("enetr b :");
            int b=sc.nextInt();
            System.out.println("enter operator");
            char op=sc.next().charAt(0);

            switch(op){
                case '+': System.out.println(a+b);
                            break;
                case '-'
            }
        }    
    
}
