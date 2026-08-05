import java.util.Scanner;
public class armstrong {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int original=n;
        int count=0;
        while(n!=0){
            int digit=n%10;
            n=n/10;
            count++;
        }
        n=original;
        while(n!=0){
            int digit=n%10;
            sum += (int)Math.pow(digit, count);;
            n=n/10;
            
        }    
        if(sum==original){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}