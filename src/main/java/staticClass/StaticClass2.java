package staticClass;

import StaticMethod.InnerClass.OuterClass;

public class StaticClass2 {
    static int a = 10;

    void show(){
        System.out.println("This is Outer Class.");
    }
    static class InnerClass{
        int b = 20;

        void display(){
            System.out.println("A : "+a + "\n"+ "B : "+b);
        }
    }

    public static void main(String[] args) {
        StaticClass2 sc = new StaticClass2();
        StaticClass2.InnerClass inner = new StaticClass2.InnerClass();
        inner.b=60;
        sc.show();
        inner.display();


    }
}
