package Thread;

public class MultiThreadLambdaDemo02 {
    public static void main(String[] args) {
        System.out.println("\n Multi Thread in lambda \n");
        F f = new F();
        f.start();

        /*Thread thread = new Thread(new Runnable() {
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
        });*/

/*        Thread thread = new Thread(
//{new Runnable() {            @Override            public void run} all replace with ->
() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println(i + " in F show | ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e.toString());
                    }
                }
            }
        });*/
        Thread thread = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println(i + " in F show | ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.toString());
                }
            }
        });
        thread.start();

    }
}


class F extends Thread {
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


