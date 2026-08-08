import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array length: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.print("Enter target element: ");
        int target=sc.nextInt();
        int count=0;
        System.out.println();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("Frequency of "+target+" in this array of size "+n+" is: "+count);
}
}
