package KeyWords;

public class StaticKeyWord {
    public static void main(String[] args) {
         //   Abc abc = new Abc(); constructor method
        // if there is static method or variable on the class
        // not necessary to me initialization as constructor method

        //all static method can be accessed on like following example
        Abc.i =5;
        Abc.show();

    }
}
//Static Keyword -->  there is any static method that is belongs to it's class

// static variable or method can not be refer to no static
class Abc {
    static int i;
    // int i; can not access without creating constructor where every where in project belongs to any static
    public static void show() {
        System.out.println("Hi Lalith ");
        System.out.println(i);//without static variable cannot access in to this method
    }
}