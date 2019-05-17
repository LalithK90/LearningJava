package Interface;

interface Abc {
    //public abstract --> not required to this part because all method in interface public and abstract
    void show();
}

interface Pqr {
    void show();
}
interface Yyy{
    void SupportMulipleInhertance();
}
 interface Xyz extends Pqr, Yyy{
     // interface support multiple inheritance
 }
/*
Creating an Object --> Invention(Ex. Mobile Phone) , Discovery (Ex. Animal)
*/
class AbcImpl implements Abc {
    // if all interface method should be implemented
    @Override
    public void show() {
        System.out.println("in show ");
    }
}
/*          Marker Interface
======================================================================
*/
interface MarkerInterface{
    void show();
}

class MarkerInterfaceDemo implements MarkerInterface{

    @Override
    public void show() {
        System.out.println("markerInterface demo sample ");
    }
}
public class InterfaceDemo {

    /*

    *** Class     vs Class --> extend
    *** Class     vs Interface --> implement
    *** Interface vs Interface --> extend

            ** Class has more power than interface in java

    -------------------------------------------
         Class                   Interface
    -------------------------------------------
        Declare Method          Declare Method
        Define Method           Can not

Java 1.8 (Java 8 ) --> Interface
    1   Marker Interface --> without any deceleration (methods)
            Ex --> Serializable, Remove (Find on Google what are default interface in java)
    2   SAM(Single Abstract Method) --> Functional Interface
    3   Normal

    Stream API

    *** using default key word can create method in interface
            ==> can not override in class
    *** using static key word can create method in interface
            ==> can override in class





    */
    public static void main(String[] args) {
        System.out.println("Implement using new class ");
        AbcImpl abc = new AbcImpl();
        abc.show();
        //======================================
        System.out.println("Implement using anonymous class --> inner class");
        Pqr pqr = new Pqr() {

            @Override
            public void show() {
                System.out.println("Power of functional interfaces");
                System.out.println("Implement using anonymous class --> inner class");
            }
        };
        pqr.show();
        //==================================================
        Pqr pqr1 = () -> {
            System.out.println("Lambda Expression using ");
        };
        pqr1.show();
        //simplify because of one line
        Pqr pqr2 = () -> System.out.println("Lambda Expression using ");
        pqr2.show();

        System.out.println("Two Interface In One Interface");
        TwoInterfaceInOneInterface twoInterfaceInOneInterface = new TwoInterfaceInOneInterface();
        twoInterfaceInOneInterface.show();
        /*          Marker Interface
======================================================================
*/
        System.out.println(" Marker Interface");
        MarkerInterfaceDemo markerInterfaceDemo = new MarkerInterfaceDemo();
        if (markerInterfaceDemo instanceof MarkerInterface){
            System.out.println("markerInterface is ok");
        }else {
            System.out.println("markerInterface is not");
        }

    }
}

class TwoInterfaceInOneInterface implements Xyz {

    @Override
    public void show() {
        System.out.println(" Show in ");
    }

    @Override
    public void SupportMulipleInhertance() {
        System.out.println(" SupportMulipleInhertance");
    }
}

