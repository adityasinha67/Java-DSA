import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev=0;
        while (a != 0) {
            int digit = a % 10;
            System.out.print(digit);
            a = a / 10;
            rev= (rev*10)+digit;
        }
        System.out.println();
        System.out.print("reversed number: "+rev);
    }
}