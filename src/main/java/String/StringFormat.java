package String;

public class StringFormat {
    public static void main(String[] args) {
        String s1 = "Vishal";
        int s3=10;
        String s2 = String.format("010%d",s3);
        System.out.println(s2 + " "+ s2.length());

        String s4=String.format("123%20s","hi");
        System.out.println(s4 + " " + s4.length());

        String s5 = String.format("%-20s","hi");
        System.out.println("s5 : " + s5.replace(" ", "0"));

        //System.out.println(String.format("%1$-" + num + "s", str, "test").replace(' ', '0'));
        System.out.println(String.format("%1$-" + 10 + "s", "Hello").replace(' ', '0'));
    }
}
