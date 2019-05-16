package KeyWords;

public class SuperKeyWordDemo {
    public static void main(String[] args) {
        //Call only A constructor
        System.out.println("Call only A constructor **\n");
        A obj = new A();
        //Call only B Constructor
        System.out.println("\n Call only B Constructor **\n");
        B obj1 = new B();
        System.out.println("\n Call A constructor with parameter **\n");
        A obj3 = new A(5);
        //Call only B Constructor
        System.out.println("\n Call B Constructor with parameter **\n");
        B obj4 = new B(10);

        System.out.println("\n Example two start\n");
        D d = new D();
        d.show();
        d.abc();

    }
}

class A //Super
{
    public A() {
        // super();
        // by default this is has ,not compulsory to mentioned
        System.out.println("Const A");
    }

    public A(int i) {
        System.out.println("Const A with parameter parameter is " + i);
    }
}

class B extends A //Sub
{
    public B() {
        super(); //This call default constructor in the extend class
        System.out.println("Const B");
    }

    public B(int i) {
        //if you want to call A class method with parameter need to call following
        super(i);
        System.out.println("Const B with parameter parameter is " + i);
    }


}

class C {
    int x = 5;
    public void abc() {
        System.out.println("abc method in C");
    }
}

class D extends C {
    int x = 20;

    public void show() {
        System.out.println(x);
        System.out.println("if need to call super method x --> " + super.x);
    }
    public void abc() {
        super.abc();
        System.out.println("abc method in D");
    }
}