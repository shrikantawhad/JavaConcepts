package String;

//intern method puts the string in String Constant Pool (SCP)or refers to another String object from the string pool having the same value.

//whenever we use a new operator to create a string it creates a new string object in the Java heap. We can forcefully stop this feature by using the intern() method of the String class.
public class InternMethod {
    public static void main(String[] args) {

        String str = new String("Hello");
        String str2 = "Hello";

        String str3 = new String("Hello");

        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));
       // String str3 =str2;

        //System.out.println("Str : "+str);
        //System.out.println("Str2 : "+str2+"\n");

        //System.out.println(str == str2);

       // str+=" world";

       /* System.out.println("Str after modification : "+str);
        System.out.println("Str2 after modifying Str : "+str2);

        System.out.println(str2 == str3);*/
    }
}
