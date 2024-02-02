package String;

import javax.lang.model.type.NullType;

public class GetChar {
    public static void main(String[] args) {
        String s1 = "Get the Characters of String";

        char[] charArray = new char[30];
                s1.getChars(0,s1.length(),charArray,0);
        System.out.println(charArray[charArray.length-1]);
    }
}
