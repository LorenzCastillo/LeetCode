package Problem0009;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String y = String.valueOf(x), revStr="";
        char a;

        for (int i = 0; i < y.length(); i++) {
            a = y.charAt(i);
            revStr = a + revStr;
        }

        if (y.equals(revStr)) {
            return true;
        } return false;
    }
}