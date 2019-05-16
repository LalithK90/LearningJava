package Encapsulation_Inheritance_Polymorphism_DynamicMethodDispatch;

public class ObjectCreationInInheritenceConstructorSuper {
    public static void main(String[] args) {
        A a = new A();
        //Remove comment see
        // A a1 = new A(5);

        System.out.println("\n not used super()");
        B b = new B();

        //when used super, default constructor method take in to before run the this method
        System.out.println("\n after used super()");
        C c = new C();

        // create object super class object of sub class
        System.out.println("\n super class object of sub class ");
        A d = new B();

    }
}

class A {
    public A() {
        System.out.println(" I am a Constructor");
    }

    public A(int a) {
        System.out.println(" I am a Constructor" + a);
    }

}

class B extends A {
    public B() {
        System.out.println("In B Constructor");
    }

    public B(int a) {
        System.out.println(" In B Constructor" + a);
    }
}

class C extends A {
    public C() {

        super(); //when used super, default constructor method take in to before run the this method
        // this super() work hidden every constructor method
        System.out.println("In C Constructor");
    }

    public C(int a) {
        System.out.println(" In C Constructor" + a);
    }
}