package CallByValueAndCallByReference;

import java.awt.*;

public class CallByReference {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.height = 10;
        modify(r1);
        System.out.println("Heigth of r1 Object : " + r1.height);
    }

    private static void modify(Rectangle r2) {
        r2.height = 20;
    }
}
