package StaticMethod.staticBlock;

// We can have multiple static blocks
// Execution is done sequentially from top to bottom for multiple static blocks.
// Used to initialize static members.
//Used to load the native methods.

public class StaticBlock {
    static int a =10;
    static{

        System.out.println("Hello: "+a);
        //System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("World");
    }


    static{
        a+=10;
        System.out.println("This is the second static block: "+ a);
    }
}
