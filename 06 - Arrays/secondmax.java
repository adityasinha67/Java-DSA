import java.util.Scanner;

public class secondmax {
    public static void main(String[] args) {
        int max = 0;
        int secondmax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Input Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondmax=max;
                max = arr[i];

            }

        }
        System.out.println("Second largest number: " + secondmax);

    }
}
