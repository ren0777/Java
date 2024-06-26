package arrays;
public class callbyref {
    public static void update(int marks[]) 
    {
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+2;
        }
    }
    public static void main(String args[]) 
    {
        int marks[]={97,98,96};
        update(marks);

        for(int i=0;i<=marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
