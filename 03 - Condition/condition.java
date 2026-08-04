/**import java.util.Scanner;
public class fourth {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println(a + " is an even number");
        }
        else{
            System.out.println(a + " is an odd number");
        }
        }
}**/
import java.util.Scanner;
public class condition {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}