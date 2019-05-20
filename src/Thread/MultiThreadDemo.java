package Thread;

import sun.util.logging.LoggingSupport;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.GLOBAL_LOGGER_NAME;
import static java.util.logging.Logger.getLogger;

public class MultiThreadDemo {
    public static void main(String[] args) {
        A a = new A();
        a.show();

// remove comment show default app run on main tread
//
//      int d = 0;
//        int e = 10;
//        int f = e / d;
//

        B b = new B();
        b.show();

        //=============================================//
        System.out.println("\n After extend Thread class\n");

        C c = new C();
        c.start();
        D d = new D();
        d.start();


    }
}

class A {
    public void show() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(" in A show");
        }
    }
}

class B {
    public void show() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(" in B show");
        }
    }
}

class C extends Thread {
    public void show() {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " in C show | ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Logger.getLogger(C.class.getName(), GLOBAL_LOGGER_NAME);
                //log(Level.SEVERE, null, e)
            }
        }
    }

    @Override
    public void run() {
        show();
    }
}

class D extends Thread {
    public void show() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " in D show | ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //  Logger logger = getLogger(C.class.getName(), log(Level.SEVERE, null, e));

            }
        }
    }

    @Override
    public void run() {
        show();
    }
}