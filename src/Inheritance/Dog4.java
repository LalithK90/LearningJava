package Inheritance;


interface Animal4{}
class Mammal4 implements Animal4 {}

public class Dog4 extends Mammal4 {

    public static void main(String args[]) {
        Mammal4 m = new Mammal4();
        Dog4 d = new Dog4();

        System.out.println(m instanceof Animal4);
        System.out.println(d instanceof Mammal4);
        System.out.println(d instanceof Animal4);
    }
}