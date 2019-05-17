package Class;

public class AbstractClassDemo {
/*

    1   Abstract Methods are method can only be declared, not defined.
    2   Abstract Class can have Abstract Methods.
    3   You can not create objects of Abstract Class.

*/

    public static void main(String[] args) {
/*
    MaheshPhone maheshPhone = new MaheshPhone(); can not instantiate the abstract class
            maheshPhone.call();
*/
        RameshPhone rameshPhone = new RameshPhone();
        rameshPhone.call();
        rameshPhone.cook();

        System.out.println("\n Example - 02\n");

        /*---------------------------------------------------------------------------*/
        Iphone iphone = new Iphone();
        show(iphone);
        SamsungS4 samsungS4 = new SamsungS4();
        show(samsungS4);
        //----------------------------
        Nokia nokia = new Nokia();
        show(nokia);
        Motroal motroal = new Motroal();
        show(motroal);



    }

    /*================Example - 02 component*/
    public static void show(Iphone iphone) {
        iphone.showConfig();
    }
    public static void show(SamsungS4 samsungS4) {
        samsungS4.showConfig();
    }

    //-------------------------------------------------
    public static void show(Phone phone){
        phone.showConfig();
        phone.sayHi();
    }
}

//Abstract class
abstract class MaheshPhone //if need to created abstract method need to abstract class
{
    public void call() {
        System.out.println("Calling...............");
    }

    public abstract void move(); //Abstract method

    public abstract void dance();

    public abstract void cook();
}

class RameshPhone extends MaheshPhone {
    @Override
    public void move() {
        System.out.println("Moving................");
    }

    @Override
    public void dance() {

    }

    @Override
    public void cook() {

    }
}

class SureshPhone extends RameshPhone //Concrete class
{
    @Override
    public void dance() {
        //super.dance();
        System.out.println("Dancing.............");
    }

    @Override
    public void cook() {
        //super.cook();
        System.out.println("Cooking.............");
    }
}
/*==========================Example - 02 component*/

class Iphone {
    public void showConfig() {
        System.out.println("Iphone config");
    }
}

class SamsungS4 {
    public void showConfig() {
        System.out.println("SamsungS4  config");
    }
}

abstract class Phone{
    public abstract void showConfig();
    public void sayHi(){
        System.out.println(" In abstract class can defying any method");
    }
}

class Nokia extends Phone{
    public void showConfig() {
        System.out.println("Nokia config");
    }
}

class Motroal extends Phone{
    public void showConfig() {
        System.out.println("Motroal  config");
    }
}