package Thread;

public class MultiThreadLambdaDemo01 {
    public static void main(String[] args) {
        System.out.println("\n Multi Thread in lambda \n");
        E e = new E();
        e.start();
//        F f = new F();
//        Thread thread = new Thread(f);
//        thread.start();

        Runnable runnable = new Runnable() {
            //After create this not required class F
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println(i + " in F show | ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e.toString());
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }
}


class E extends Thread {
    public void show() {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " in E show | ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
                // Logger.getLogger(C.class.getName(), log(Level.SEVERE, null, e));

            }
        }
    }

    @Override
    public void run() {
        show();
    }
}

/*

class F implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " in F show | ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //  Logger logger = getLogger(C.class.getName(), log(Level.SEVERE, null, e));

            }
        }
    }
}*/
