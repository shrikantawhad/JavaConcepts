package StaticMethod;


public class T1 {
    static int contact = 10;
    int contct = 20;

    public static void show() {
        System.out.println("Static Contact: " + new T1().contct);
        new T1().displayContact();
    }

    public static void main(String[] args) {
        show();
    }

    public void displayContact() {
        System.out.println("Non Static Contact: " + contact + contct);
    }
}
