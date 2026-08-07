import java.util.Scanner;

public class sortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean isSorted = true;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Input Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted=false;
                break;
            }

        }
        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("unsorted");
        }
    }
}
