package String;

public class StringTrim {
    public static void main(String[] args) {
        String str = " Hello World ";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase()+"\n");
        System.out.println("Without Trim lenght is "+str.length()+" "+str +"\n");
        System.out.println("With Trim length is "+str.trim().length()+" "+str.trim());
    }
}
