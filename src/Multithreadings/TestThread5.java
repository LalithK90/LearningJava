package Multithreadings;

class Chat1 {
    boolean flag = false;

    public synchronized void Question(String msg) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = true;
        notify();
    }

    public synchronized void Answer(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(msg);
        flag = false;
        notify();
    }
}

class T3 implements Runnable {
    Chat1 m;
    String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };

    public T3(Chat1 m1) {
        this.m = m1;
        new Thread(this, "Question").start();
    }

    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.Question(s1[i]);
        }
    }
}

class T4 implements Runnable {
    Chat1 m;
    String[] s2 = { "Hi", "I am good, what about you?", "Great!" };

    public T4(Chat1 m2) {
        this.m = m2;
        new Thread(this, "Answer").start();
    }

    public void run() {
        for (int i = 0; i < s2.length; i++) {
            m.Answer(s2[i]);
        }
    }
}
public class TestThread5 {
    public static void main(String[] args) {
        Chat1 m = new Chat1();
        new T3(m);
        new T4(m);
    }
}