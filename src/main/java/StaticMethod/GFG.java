package StaticMethod;
/*------Content-----------*/

//static keyword
//Anonymous Object

/*--------------------------*/

//A local variable cannot be defined with "static" keyword.

// Java program to demonstrate that The static method does not have access to the instance variable

//A static method in Java is a method that is part of a class rather than an instance of that class.
//Every instance of a class has access to the method.
//Static methods have access to class variables (static variables) without using the class’s object (instance).
//Only static data may be accessed by a static method. It is unable to access data that is not static (instance variables).
//In both static and non-static methods, static methods can be accessed directly.


public class GFG {
    // static variable
    static int a = 40;
    // instance variable
    int b = 80;

    public GFG() {
        System.out.println("Default constructor b : " + b);
    }

    public GFG(int b) {
        System.out.println("parameterised constructor b : " + b);
        this.b = b;
    }

    // Declaration of a static method.
    static void staticDisplay() {
        System.out.println("staticDisplay a : " + a);
        a += 10;
    }

    static void addDisplay() {
        a += 10;
        System.out.println("addDisplay a : " + a);
    }

    // main method
    public static void main(String[] args) {
        GFG obj = new GFG(), obj2 = new GFG(); //


        // Calling static method.
        staticDisplay();
        obj.simpleDisplay();
        addDisplay();
        new GFG(98).display(); // Calling method using Anonymous Object

    }

    void display() {
        System.out.println("This is instance method.");
        System.out.println("display a : " + a);
        System.out.println("b : " + b);
    }

    void simpleDisplay() {
        System.out.println("sampleDisplay : " + a);
        System.out.println("sampleDisplay : " + b);
        System.out.println("object reference b :" + this.b);
    }
}