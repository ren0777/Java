import java.io.*;
public class looptable{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i=1;i<11;i++)
        {
            System.out.printf("%d x %d = %d%n",N,i,N*i);
            System.out.println(N+" x "+i+" = "+N*i );
        }

        bufferedReader.close();
    }
}