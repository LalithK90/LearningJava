package Encapsulation_Inheritance_Polymorphism_DynamicMethodDispatch;

public class DynamicMethodDispatchDemo {
  // Dynamic Method Dispatch Run time Polymorphism
    public static void main(String[] args) {

        X obj = new X();
        Y obj1 = new Y();
        X x; //This is not work x.Show()
        X.Show();
        Y.Show();

        System.out.println("Parent class has able to equal child like father DNA is equal to child DNA");
        X x1;
        x1 = obj1;
        X.Show();

        System.out.println("Child class can not equal to child");

     /*   Y y;
        y = obj;
        y.Show();*/
    }
}

class X {
    public static void Show() {
        System.out.println("In show X");
    }
}

class Y extends X {
    public static void Show() {
        System.out.println("In show Y");
    }
}