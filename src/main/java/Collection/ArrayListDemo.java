package Collection;


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("HI");
        l.add("Hello");
        l.add(123);

        for (Object s : l) {
            System.out.println(s);
        }

    }
}
