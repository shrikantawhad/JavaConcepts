package Programs;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String str = "Reviver";
        System.out.println(p.isPalindrome(str));
    }

    private boolean isPalindrome(String str) {

        int size = str.length();

        if (size == 0 | size == 1) {
            //System.out.println("String is not Palindrome as it is null or contains only single character");
            return true;
        }

        String f = str.substring(0, 1);
        String l = str.substring(size - 1);

        System.out.println("F : " + f + "\n" + "l :" + l);

        if (l.equalsIgnoreCase(f)) {
            return isPalindrome(str.substring(1, size - 1));
        }

        return false;
    }
}
