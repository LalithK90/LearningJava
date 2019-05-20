package Inheritance;

class Superclass1 {
    int age;

    Superclass1(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " +age);
    }
}

public class Subclass1 extends Superclass1 {
    Subclass1(int age) {
        super(age);
    }

    public static void main(String argd[]) {
        Subclass1 s = new Subclass1(24);
        s.getAge();
    }
}