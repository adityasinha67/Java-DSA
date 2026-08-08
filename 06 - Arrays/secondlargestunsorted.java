import java.util.Scanner;

public class secondlargestunsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array length: ");
        int n = sc.nextInt();
        int max = 0;
        int secondmax = 0;
        int[] arr = new int[n];
        System.out.print("Enter Elements: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if (arr[i] > max) {
                secondmax=max;
                max = arr[i];
            }

            else if (arr[i] > secondmax) {
                secondmax = arr[i];
            }
        }
        
            System.out.print("second largest: "+secondmax); 
    
    }
}
