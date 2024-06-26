package arrays;

public class linearSearch {
    public static int linearsearch(int number[],int key) {
        
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,9,0};
        int key=7;

        int index=linearsearch(number, key);
        if(index==-1){
            System.out.println("not found");
        } else{
            System.out.println("key is at index "+index);
        }

    }
    
}
