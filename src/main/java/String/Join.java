package String;

import java.sql.SQLOutput;

public class Join {
    public static void main(String[] args) {
        String str = "Hi this is the sample string to check last index";
        String str2 = String.join("-","Hello","World");
        System.out.println(str2);

        int str4 = str.lastIndexOf("to");
        System.out.println();
    }
}
