import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            

        }
        System.out.print("Enter number to search: ");
        int target=sc.nextInt();
        boolean Found=false;
        for (int i = 0; i < n; i++) {
            if(arr[i]==target){
                System.out.println();
                System.out.println("Element found at index "+i+".");
                Found=true;
                break;
            }
                 
        }
        if(!Found){
            System.out.println("Element Not Found");
        }
        
              
    }
}
