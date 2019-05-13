package Operators.Statments.Loop;

public class LoopPattenLogic {
    public static void main(String[] args) {
        normal();
        forLoopInForLoop();
        Example1();
        Example2();
        Example3();
        Example4();
        Example5();
        Example6();
    }

    private static void normal() {
        for (int i = 0; i <= 5; i++) {
            System.out.print(" *");
        }
        System.out.println("");
        for (int i = 0; i <= 5; i++) {
            System.out.print(" *");
        }
        System.out.println("");
        for (int i = 0; i <= 5; i++) {
            System.out.print(" *");
        }
        System.out.println("");
        for (int i = 0; i <= 5; i++) {
            System.out.print(" *");
        }
        System.out.println("");
        for (int i = 0; i <= 5; i++) {
            System.out.print(" *");
        }
        System.out.println("");
        for (int i = 0; i <= 5; i++) {
            System.out.print(" *");
        }
    }

    private static void forLoopInForLoop() {
        System.out.println("\n\n for loop in for loop { nested for loop} \n");
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    private static void Example1() {
        System.out.println("\n");
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    private static void Example2() {
        System.out.println("\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    private static void Example3() {
        System.out.println("\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    private static void Example4() {
        System.out.println("\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println("");
        }
    }

    private static void Example5() {
        System.out.println("\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + j - 1 + " ");
            }
            System.out.println("");
        }
    }

    private static void Example6() {
        System.out.println("\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                int k = i + j - 1;
                if (k > 4) {
                    System.out.print(k - 4 + " ");
                } else {
                    System.out.print(k + " ");
                }

            }
            System.out.println("");
        }
    }
}
