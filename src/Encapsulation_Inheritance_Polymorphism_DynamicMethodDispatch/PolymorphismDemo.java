package Encapsulation_Inheritance_Polymorphism_DynamicMethodDispatch;

public class PolymorphismDemo {
    /*
    Poly --> Many
    Morphism --> behaviour

    */
    /*

    Overloading --> Different method in same name but with different parameter
    Overriding --> Different method in same name but with same parameter in different class

    */
    public static void main(String[] args) {
        System.out.println("Method Overloading, Early Binding, Static Binding, Compile time Polymorphism Example \n");
        D obj = new D();
        obj.Show();
        obj.Show(10);
        obj.Show(15.00);

        System.out.println("\n Method overriding,Late Binding, Dynamic Binding, Runtime Polymorphism \n");
        F obj1 = new F();
        obj1.Show(); //not go to class E
        obj1.Show(100); // go to class E
        obj1.Show(15.02); // not go to class E


    }

}

class D // Method Overloading, Early Binding, Static Binding, Compile time Polymorphism
{
    public void Show() {
        System.out.println("In show Hello");
    }

    public void Show(int i) {
        System.out.println("In show Hello parameter" + i);
    }

    public void Show(double a) {
        System.out.println("In show Hello parameter" + a);
    }
}

class E // Method overriding,Late Binding, Dynamic Binding, Runtime Polymorphism
{
    public void Show() {
        System.out.println("In E show Hello");
    }

    public void Show(int i) {
        System.out.println("In E show Hello parameter " + i);
    }

    public void Show(double a) {
        System.out.println("In E show Hello parameter " + a);
    }
}

class F extends E //
{   @Override
    public void Show() {
        System.out.println("In F show Hello");
    }

    public void Show(double a) {
        System.out.println("In F show Hello parameter " + a);
    }
}
