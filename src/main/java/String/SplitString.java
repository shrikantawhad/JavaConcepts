package String;

import com.sun.security.jgss.GSSUtil;

public class SplitString {
    public static void main(String[] args) {
        String str ="Writing string to check split method on it";
        String str2 = "AAAAAABBBBBCCCCC";
        System.out.println(str2.replace("B","Z"));
        //here limit means how may parts we want for the given string.
        //limit = 0 will divide string equally with given regex.
        String[] arr=str.split("\\s",0);
        System.out.println("Length of Array :"+arr.length);

        for(String s:str.split("\\s",0)){
            System.out.println(s);
        }
    }
}
