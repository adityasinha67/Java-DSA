import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size:");
        int n = sc.nextInt();
        int sum=0;
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print("Input Array: ");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
            sum+=arr[i];
        }
        System.out.println("Sum of Array Elements: "+sum);
    }
}
