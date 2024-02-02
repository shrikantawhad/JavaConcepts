package String;

import java.io.UnsupportedEncodingException;

public class GetBytes {
    public static void main(String[] args) {
        String s1 = new String("AAAAAA");

        byte[] brr = s1.getBytes();
        System.out.println(brr[0]);

        String s2 = new String(brr);
        System.out.println(s2);

  /*      //16 - bit UCS Transformation format
        byte[] byteArr = new byte[0];
        try {
            byteArr = s1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After converted into UTF-16 the String is : ");

        for (int j = 0; j < byteArr.length; j++)
        {
            System.out.println(byteArr[j]);
        }*/


    }
}
