public class wordcount {
    public static void main(String[] args) {
        String s="hello world my love i am so happy";
        int count=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        System.out.println("Word count: "+count);
    }
}
