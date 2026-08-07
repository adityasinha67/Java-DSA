import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println();
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
        System.out.println("Reversed Array: ");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }

    }
}
