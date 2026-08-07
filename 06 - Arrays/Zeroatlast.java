import java.util.Scanner;
public class Zeroatlast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Array lenght: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter " +n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int original=arr[i];
                arr[i]=arr[j];
                arr[j]=original;
                j++;
            }
        }
        System.out.print("Final array with zero at last: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
