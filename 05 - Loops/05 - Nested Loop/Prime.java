import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean isPrime=true;
        if(a<=1){
            System.out.println("Not Prime");
            return;
        }
        for(int i=2;i*i<a;i++){
            if(a%i==0){
                isPrime=false;
                break;
            }
            
        }
        if(isPrime==true){
                System.out.println("Prime");

            }
            else{
                System.out.println("Not Prime");
            }
    }
}
