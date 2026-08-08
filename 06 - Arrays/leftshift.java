import java.util.Scanner;

public class leftshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        
        if (k > n) {
            k = k % n;
        }
        for (int j = 0; j < k; j++) {
            int temp = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
             arr[n - 1] = temp;
        }
       
        System.out.print("Array after "+k+" shift: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
