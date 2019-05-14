package ShortHandOperationANDMissilenous;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        Example01(4, 5);
        Example02(10, 11);
        Example03(15, 16);
        Example04(5,4);
        Example05(8,7);
    }

    private static void Example01(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x : " + x);
        System.out.println("y : " + y);

    }

    private static void Example02(int x, int y) {
        int z;
        z = x+y;
        y = z-y;
        x = z-x;
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }

    private static void Example03(int x, int y) {

        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }

    private static void Example04(int x,int y) {
        /*
         *  X = 5   --> 101
         *  Y = 4   --> 100
         *
         *          ^ = XOR
         * ================================
         * | A     |     B     |  Answer  |
         * | ======|===========|==========|
         * | True  |   True    |    False |
         * | True  |   False   |    True  |
         * | False |   True    |    True  |
         * | False |   False   |    False |
         * ================================
         *
         * */
        x = x^y;//1 0 1 ^ 1 0 0 --> 0 0 1
        y = x^y;//0 0 1 ^ 1 0 0 --> 1 0 1 -> 5
        x = x^y;//0 0 1 ^ 1 0 1 --> 1 0 0 -> 4

        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
    private static void Example05(int x, int y) {
        y = x+y - (x =y);
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
