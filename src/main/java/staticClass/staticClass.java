package staticClass;

public class staticClass {
    int contact;
    String name;
    static String city;

    public staticClass() {
    }

    public staticClass(int contact, String name) {
        this.contact = contact;
        this.name = name;
    }
    void display2(){
        System.out.println("City: "+city);
    }

    public static void display(int contact, String name){
        System.out.println("Name: "+ name+"\n" + "Contact: "+contact);
    }
    public static class InnerStaticClass{
        void display3(){
            System.out.println("This is inner Static class.");
        }

        public static void main(String[] args) {
            InnerStaticClass obj = new InnerStaticClass();
            staticClass sj = new staticClass(34,"Ram");
            display(123,"Aditya");
            new staticClass().display2();
        }

    }

}
