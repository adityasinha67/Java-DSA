public class palindrome {
    public static void main(String[] args) {
        String s = "madam";
        int left = 0;
        int right = s.length() - 1;
        boolean found = true;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                found = false;
                break;
            }

        }
        if (found) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
