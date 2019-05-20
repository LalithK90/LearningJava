package Class;

@FunctionalInterface
interface X { //SAM--> single abstract method interface
    void show();
}

/*

Member inner
class C {
    int rolNo;
    String name;

    class D {
        public void show() {
            System.out.println("member inner class");

        }
    }

}*/
/*
static inner class

class C {
    int rolNo;
    String name;

    static class D {
        public void show() {
            System.out.println("static inner class");
        }
    }

}*/
/*
Anonymous inner class

class C {
    public void show() {
        System.out.println("Anonymous inner class");

    }
}*/

public class InnerClassDemo {
    /*
    Inner class
    ===============
        Member inner class
        Static inner class
        Anonymous class
        Lambda

        */
    public static void main(String[] args) {
        //D d =new D();
/* Member inner

 C c = new C();
        C.D d = c.new D();*/
/*
static inner class
        C.D c= new C.D();
        c.show();
*/
/*
Anonymous inner class

        C c = new C() {
            public void show() {
                System.out.println("Anonymous inner class");

            }
        };
            c.show();
*/

//Lambada
        X x = () -> System.out.println("Lambda inner class");

        x.show();
    }
}
