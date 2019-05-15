package Array;

import java.util.Random;

public class TwoDiamentionalArray {
    /*
     a[]  = [1,2,3,4,5];
     b[]  = [7,8,9];
     c[]  = [6,5,4];

     d[]  = [1,2,3,4,5,7,8,9,6,5,4];


     */
    public static void main(String[] args) {
        Example01();
        Example02();
        Example03();
    }

    private static void Example01() {
        int a = 4, b = 5, c = 6, d = 7;
        int x[] = {1, 2, 3, 4, 5};
        int y[] = {7, 8, 9};
        int z[] = {6, 5, 4};

        int p[][] = {
                {1, 2, 3, 4, 5}, {7, 8, 9}, {6, 5, 4}
        };
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                System.out.println(p[i][j]);
            }
        }
    }
    private static void Example02() {
        System.out.println("");
        int[] nums = new int[10];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(50);
        }
        for (int num : nums){
            System.out.println(num);
        }
    }
    private static void Example03() {
        System.out.println("");
        int x[] = {1, 2, 3, 4};
        int y[] = {7, 8, 9};
        int z[] = {6, 5, 4};

        int p[][] = {
                {1, 2, 3, 4}, {7, 8, 9}, {6, 5, 4}
        };
        for (int i[] : p){
            for (int j : i){
                System.out.print(j+" ");
            }
        }
    }
}
