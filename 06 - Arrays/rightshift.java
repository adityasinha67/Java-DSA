import java.util.Scanner;

public class rightshift {
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
        
        
            k = k % n;
        
        for (int j = 0; j < k ; j++) {
            int temp = arr[n-1];
            for (int i = n-1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
             arr[0] = temp;
        }
       
        System.out.print("Array after "+k+" shift: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}