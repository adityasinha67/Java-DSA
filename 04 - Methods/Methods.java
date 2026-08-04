/**public class methods {
    static void Introduction(){
        System.out.println("Hello, My name is Aditya");
        System.out.println("I am preparing for placements");
    }
    static void line(){
        System.out.println("--------------------------");
    }
    public static void main(String args[]){
        line();
        Introduction();
        line();
    }
}**/
public class Methods {
    static boolean Ispositive(int x){
        return x>=0;
    }
    public static void main(String args[]){
        boolean a= Ispositive(-10);
        System.out.println(a);
    }
}