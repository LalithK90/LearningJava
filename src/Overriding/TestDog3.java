package Overriding;

class Animal1 {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog1 extends Animal1 {
    public void move() {
        System.out.println("Dogs can walk and run");
    }
    public void bark() {
        System.out.println("Dogs can bark");
    }
}

public class TestDog3 {

    public static void main(String args[]) {
        Animal1 a = new Animal1();   // Animal reference and object
        Animal1 b = new Dog1();   // Animal reference but Dog object

        a.move();   // runs the method in Animal class
        b.move();   // runs the method in Dog class
        //b.bark();
    }
}
