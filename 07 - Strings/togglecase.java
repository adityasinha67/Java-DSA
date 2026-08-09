public class togglecase {
    public static void main(String[] args) {
        String s="Hello";
        String tc="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                char chh= Character.toLowerCase(ch);
                tc=tc+chh;
            }else{
                char cch= Character.toUpperCase(ch);
                tc=tc+cch;
            }
        }
        System.out.println("Case toggled String: "+tc);
    }
}
