import java.util.Scanner;

public class missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int expectedSum = 0;
        int actualSum = 0;

        for (int i = 1; i <= n; i++) {
            expectedSum += i;
        }

        for (int i = 0; i < n - 1; i++) {
            actualSum += arr[i];
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing number: "+missing);
    }
}
