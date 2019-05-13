package Operators.Statments.Loop;

public class Loops {
    public static void main(String[] args) {
        Normal();
        While();
        DoWhile();
        forLoop();
    }

    private static void Normal() {
        System.out.println("Number " + 1);
        System.out.println("Number " + 2);
        System.out.println("Number " + 3);
        System.out.println("Number " + 4);
        System.out.println("Number " + 5);
        System.out.println("Number " + 6);
        System.out.println("Number " + 7);
        System.out.println("Number " + 8);
        System.out.println("Number " + 9);
        System.out.println("Number " + 10 + "\n");
    }

    private static void While() {
        int a = 1;
        while (a <= 10) {
            System.out.println("While loop number " + a);
            a++;
        }
        System.out.println("\n");
        boolean b = true;
        while (b) {
            System.out.println("While loop boolean " + b +"\n");
            b = false;
        }
    }

    private static void DoWhile() {
        int x = 10;

        do {
            System.out.println("Do while loop do part \n");
        } while (x < 10);
    }

    private static void forLoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number for loop " + i);
        }
        System.out.println("\n");
    }


}
