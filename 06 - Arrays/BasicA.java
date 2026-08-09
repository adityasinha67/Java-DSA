import java.util.Scanner;

public class BasicA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
                System.out.print(arr[i]+ " ");
            }       
        }
    }
}
