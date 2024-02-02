package Programs;

public class PalindromeCheck {
    public static void main(String[] args) {
        PalindromeCheck pc = new PalindromeCheck();


        String str = "Racecar1";
        System.out.println("Original Palindrome Check Method : "+isPalindrome(str));
        System.out.println("My Palindrome Check Logic : "+pc.checkPalindrome(str));
    }

    public boolean checkPalindrome(String str){
        return reverString(str);
    }

    public boolean reverString(String str) {
        String str3=str;
        String newString="";

        for(int i=str3.length()-1;i>=0;i--){
             newString+=String.valueOf(str3.charAt(i));
        }
        //System.out.println("New String Value :"+newString);

        //System.out.println("Final Check :"+);
        return str.equalsIgnoreCase(newString);
    }

    private static boolean isPalindrome(String str) {
        int size = str.length();

        if(size == 0 | size == 1){
            return true;
        }

        String f = str.substring(0, 1);
        String l = str.substring(size-1);

        if(l.equalsIgnoreCase(f)){
            return isPalindrome(str.substring(1, size-1));
        }


        return false;
    }
}
