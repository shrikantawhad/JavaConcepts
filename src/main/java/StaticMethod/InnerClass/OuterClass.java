package StaticMethod.InnerClass;

public class OuterClass {
    int a = 10;

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass("Vishal");

        inner.Show();
        inner.callShow();
    }

    class InnerClass {
        String x = " Justin";

        public InnerClass(String x) {
            this.x = x;
        }

        void Show() {
            System.out.println("A: " + a + "\n" + "X: " + this.x);
        }

        public void callShow() {
            InnerClass inner = new InnerClass("Aditya");
            inner.Show();
        }


    }


}
