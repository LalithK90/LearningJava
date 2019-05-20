package Thread;

public class MultiThreadLambdaDemo03 {
    public static void main(String[] args) {
        System.out.println("\n Multi Thread in lambda \n");
/*  3

        G g = new G();
        g.start();
*/

       /*  1
        Thread thread = new Thread(() -> {
            for (int i = 0; i <= 6; i++) {
                System.out.println(i + " in F show | ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.toString());
                }
            }
        });
        thread.start();*/
/*    2
 Thread thread = new Thread(() -> {
            for (int i = 0; i <= 6; i++) {
                System.out.println(i + " in F show | ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.toString());
                }
            }
        }).start();*/
       /* 5

       new Thread(() -> {
            for (int i = 0; i <= 6; i++) {
                System.out.println(i + " in one show | ");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println(e.toString());
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i <= 6; i++) {
                System.out.println(i + " in two show | ");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println(e.toString());
                }
            }
        }).start();*/

        /*new Thread(() -> {
            new MultiThreadLambdaDemo03().show(" Part one ");
        }).start();

        new Thread(() -> {
            new MultiThreadLambdaDemo03().show(" Part two ");

        }).start();*/

        new Thread(() -> new MultiThreadLambdaDemo03().show(" Part one ")).start();

        new Thread(() -> new MultiThreadLambdaDemo03().show(" Part two ")).start();

    }

    public void show(String str) {
        for (int i = 0; i <= 6; i++) {
            System.out.println(i + " given data | " + str);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }

    }
}

/* 4

class G extends Thread {
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
*/


