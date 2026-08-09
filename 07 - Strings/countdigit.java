public class countdigit {
    public static void main(String[] args) {
        String s = "abc123xyz45";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                count++;
            }
        }
        System.out.println("Number of digits: "+count);
    }
}
