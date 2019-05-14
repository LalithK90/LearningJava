package ShortHandOperationANDMissilenous;

public class LoopPattenLogic {
    public static void main(String[] args) {
        normal();
        /*expected output
        -----------------
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
        forLoopInForLoop();
        /*expected output
        ------------------
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        Example1();
        /*expected output
        -----------------
         *
         * *
         * * *
         * * * *
         * * * * *

         */
        Example2();
        /*expected output
        -----------------
        1 2 3 4
        1 2 3 4
        1 2 3 4
        1 2 3 4
         */
        Example3();
        /*expected output
        -----------------
        1 1 1 1
        2 2 2 2
        3 3 3 3
        4 4 4 4
         */
        Example4();
          /*expected output
        -----------------
        2 3 4 5
        3 4 5 6
        4 5 6 7
        5 6 7 8
         */
        Example5();
          /*expected output
        -----------------
        1 2 3 4
        2 3 4 5
        3 4 5 6
        4 5 6 7
         */
        Example6();
          /*expected output
        -----------------
        1 2 3 4
        2 3 4 1
        3 4 1 2
        4 1 2 3
         */
        Example7();
          /*expected output
        -----------------
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
         */
    }

    private static void normal() {
        for (int i = 0; i <= 5; i++) {
            System.out.print(" *");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(" *");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(" *");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(" *");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(" *");
        }
        System.out.println();
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
            System.out.println();
        }
    }

    private static void Example1() {
        System.out.println("\n");
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static void Example2() {
        System.out.println("\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void Example3() {
        System.out.println("\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void Example4() {
        System.out.println("\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }

    private static void Example5() {
        System.out.println("\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + j - 1 + " ");
            }
            System.out.println();
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
            System.out.println();
        }
    }

    private static void Example7() {
        System.out.println("\n");
        /* target out put
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         * */
        int i;
        int j;

        for (i = 1; i <= 5; i++) // rows
        {
            for (j = 1; j <= i; j++) // columns
            {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
