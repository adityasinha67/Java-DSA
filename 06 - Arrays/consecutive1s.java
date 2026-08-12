import java.util.Scanner;

public class consecutive1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " numbers: ");
    for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int streak = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                streak++;
                if (streak > max) {
                    max = streak;
                }
                
            } else {
                streak = 0;
            }
        }
    }
}
