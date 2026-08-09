public class countletter {
    public static void main(String[] args) {
        String s = "hello123world!";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                count++;
            }
        }
        System.out.println("Number of digits: "+count);
    }
}
