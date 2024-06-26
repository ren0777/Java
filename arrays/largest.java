package arrays;

import java.util.*;

public class largest {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest=numbers[i];
            }
            if (smallest > numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest value is = "+smallest);
        return largest;
    }

    public static void main(String[] args) {
        int number[]={1,4,2,7,5,8,7,0};
        System.out.println("largest is = "+getLargest(number));
    }
    
}
