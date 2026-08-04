import java.util.Scanner;
public class second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String college = sc.nextLine();
        String branch = sc.nextLine();
        int year = sc.nextInt();
        double cgpa = sc.nextDouble();
        System.out.println("--STUDENT DETAILS--");
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old.");
        System.out.println("I am studying at " + college);
        System.out.println("My branch is " + branch);
        System.out.println("I am in my " + year + " year.");
        System.out.println("My CGPA is " + cgpa);
    }
}
