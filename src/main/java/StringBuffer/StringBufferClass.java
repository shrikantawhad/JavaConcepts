package StringBuffer;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }
        System.out.println("Time Taken : " + (System.currentTimeMillis() - startTime));


        String str = "Java";
        for (int i = 0; i < 1000; i++) {
            str = str + "Java";
        }
        System.out.println("Time Taken : " + (System.currentTimeMillis() - startTime));
    }
}
