package arrays;
import java.util.Scanner;

public class sumofrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the array from the user
        int[][] arr = inputArray(sc);

        System.out.println("Enter row whose sum is to be found:");
        int r = sc.nextInt();

        // Check if the row is within the bounds of the array
        if (r >= arr.length || r < 0) {
            System.out.println("Invalid row index");
            return;
        }

        int sum = calculateRowSum(arr, r);
        System.out.println("Sum = " + sum);
    }

    public static int[][] inputArray(Scanner sc) {
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public static int calculateRowSum(int[][] arr, int r) {
        int sum = 0;
        for (int j = 0; j < arr[r].length; j++) {
            sum += arr[r][j];
        }
        return sum;
    }
}