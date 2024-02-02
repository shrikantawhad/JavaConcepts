package WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {

        //Autoboxing : Converting primitive to Object
        int a = 10;
        Integer k = a;
        System.out.println("Integer Object : " + k); // Autoboxing

        char character = 'c';
        Character ch = character;
        System.out.println("Character Object : " + ch);

        float floatValue = 10.34F;
        Float f = floatValue;
        System.out.println("Float Object : " + f);

        double doubleValue = 23.45D;
        Double d = doubleValue;
        System.out.println("Double Object : " + d);

        long longValue = 12123;
        Long l = longValue;
        System.out.println("Long Object : " + l);

        boolean booleanValue = true;
        Boolean b = booleanValue;
        System.out.println("Boolean Object : " + b);

        short shortValue = 30;
        Short s = shortValue;
        System.out.println("Short Object : " + s);


        //Unboxing : Object to Primitive

        shortValue = s;
        System.out.println("Primitive short : " + shortValue);
    }
}
