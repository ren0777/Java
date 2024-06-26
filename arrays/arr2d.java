package arrays;
public class arr2d {
    public static void main(String[] args) {

        int[][] arr={{1,2,3},{3,4,2},{7,6,5},{7,5,7}};
        int n=arr.length;
        int m=arr[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("The number 7 appears " + count + " times in the array.");
    }
    
    
}
