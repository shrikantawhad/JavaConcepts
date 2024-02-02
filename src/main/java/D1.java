public class D1 {
    public static boolean isPalindrome(String str) {
        int size = str.length();
        String l = str.substring(0, 1);
        String h = str.substring(size - 1);

        if (size == 0 || size == 1) {
            return true;
        }
        if (l.equalsIgnoreCase(h)) {
            return isPalindrome(str.substring(1, size - 1));
        }
        return false;
    }

        public static void main (String[]args){
            String str = "Racecar1";

            System.out.println(isPalindrome(str));

        }
    }

