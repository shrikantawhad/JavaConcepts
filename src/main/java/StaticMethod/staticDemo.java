package StaticMethod;

public class staticDemo {
    static int number = 10;
    int contact = 20;

    static void show() {
        number = 40;
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        staticDemo sd = new staticDemo();
        new staticDemo().display();
        show();
    }

    public void display() {
        number = 30;
        System.out.println("Number: " + number);
        System.out.println("Contact: " + contact);
    }
}
