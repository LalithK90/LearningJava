package Array;

import java.util.Random;

public class ThreeDiamentionalArray {
    public static void main(String[] args) {
        Example01();
        Example02();
        Example03();
    }

    private static void Example01() {
        int a[] = new int[4]; //one
        int b[][] = new int[4][2]; //two
        int c[][][] = new int[4][3][2]; //three

        Random random = new Random();

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int k = 0; k < c[i][j].length; k++) {
                    c[i][j][k] = random.nextInt(10);
                }
            }
        }
        System.out.println("\n normal for loop is used \n");
        for (int e = 0; e < c.length; e++) {
            for (int f = 0; f < c[e].length; f++) {
                for (int g = 0; g < c[e][f].length; g++) {
                    System.out.print("Index is : " + e + " " + f + " " + g + " value " + c[e][f][g] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Enhanced for loop is used \n");

        for (int[][] p : c) {
            for (int[] q : p) {
                for (int r : q) {
                    System.out.print(r + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    private static void Example02() {
        int c[][][][] = new int[4][3][2][2]; //four

        Random random = new Random();

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int k = 0; k < c[i][j].length; k++) {
                    for (int l = 0; l < c[i][j][k].length; l++) {
                        c[i][j][k][l] = random.nextInt(10);
                    }
                }
            }
        }
        System.out.println("\n normal for loop is used \n");
        for (int e = 0; e < c.length; e++) {
            for (int f = 0; f < c[e].length; f++) {
                for (int g = 0; g < c[e][f].length; g++) {
                    for (int i = 0; i < c[e][f][g].length; i++) {
                        System.out.print("Index is : " + e + " " + f + " " + g + " " + i + " value " + c[e][f][g][i] + " ");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    private static void Example03() {
        int c[][][][][] = new int[4][3][2][2][2]; //five

        Random random = new Random();

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int k = 0; k < c[i][j].length; k++) {
                    for (int l = 0; l < c[i][j][k].length; l++) {
                        for (int m = 0; m < c[i][j][k][l].length; m++) {
                            c[i][j][k][l][m] = random.nextInt(10);
                        }
                    }
                }
            }
        }
        System.out.println("\n normal for loop is used \n");
        for (int e = 0; e < c.length; e++) {
            for (int f = 0; f < c[e].length; f++) {
                for (int g = 0; g < c[e][f].length; g++) {
                    for (int i = 0; i < c[e][f][g].length; i++) {
                        for (int j = 0; j < c[e][f][g][i].length; j++) {
                            System.out.print("Index : " + e + " " + f + " " + g + " " + i + " " + j + " value " + c[e][f][g][i][j] + " ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
            System.out.println("");
        }

    }
}
