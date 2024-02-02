package String;

public class IndexOf {
    public static void main(String[] args) {
        String str = " This is the sample string for indexOf method. ";

        int index = str.indexOf("sample");
        System.out.println("index of the :" + index);

        int indexWithSubString = str.indexOf('s',11);
        System.out.println("Index with SubString : "+indexWithSubString);
    }
}
