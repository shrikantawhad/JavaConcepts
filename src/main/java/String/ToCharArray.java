package String;

public class ToCharArray {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.startsWith("He"));
        char charArray[] = str.toCharArray();

        System.out.println(charArray[1]);

        char[] charArray2 = str.toCharArray();

        for (int i = 0; i < charArray2.length; i++) {
            System.out.println(charArray2[i]);
        }
    }
}
