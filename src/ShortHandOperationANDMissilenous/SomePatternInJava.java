package ShortHandOperationANDMissilenous;

import javafx.scene.paint.Stop;

public class SomePatternInJava {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println("\n");

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println("\n");

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println("\n");

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");

        for (int x = 1; x <= 4; x++) {
            for (int y = 1; y <= 4; y++) {
                if (x == 1 || x == 4 || y == 1 || y == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

        System.out.println("\n");

        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
