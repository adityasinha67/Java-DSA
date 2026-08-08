public class removespaces {
    public static void main(String[] args) {
        String s="hello world java   ";
        String rev="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                continue;
            } else{
                rev=rev+ch;
            }

        }
        System.out.println("Without spaces: "+rev);
    }
}
