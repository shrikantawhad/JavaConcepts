package String;

public class StringCompareTo {
    public static void main(String[] args) {

        //Compare the Ascii Value
        // if s1 >  s2  = Positive Output
        // if s1 <  s2  = Negative Output
        // if s1 == s2  = 0 Output

        String s1="ADITYA";
        String s2="abaX";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains(new String("A")));
        System.out.println(s1.endsWith(new String("b") ));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        int s5 = 201;

        String s3 = String.format("%s %s",s1, s2);
        String s4 = String.format("%d", 201);
        System.out.println("Integer Compare : "+(Integer.parseInt(s4)==s5));
        System.out.println(String.format("%s", s1));
        System.out.println(s3);
        System.out.println(s3.equals(s1.concat(" "+s2)));


    }
}
