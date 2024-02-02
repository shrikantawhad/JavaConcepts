package CallByValueAndCallByReference;

public class CallByValue {
    public static void main(String[] args) {
        int x = 10;
        modify(10);
        System.out.println("Value of x : " + x);  // Output 10
    }

    private static void modify(int data) {
        data = 20;
    }
}
