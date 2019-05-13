package Operators.Statments;

public class IfElse {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = a +b;

        if (a%2 == 0) {
            System.out.println("Even number");
        }else{
            System.out.println(" Odd Number");
        }
        /**
         *          AND Operator
         * ================================
         * | A     |     B     |  Answer  |
         * | ======|===========|==========|
         * | True  |   True    |    True  |
         * | True  |   False   |    False |
         * | False |   True    |    False |
         * | False |   False   |    False |
         * ================================
         *          Or Operator
         * ================================
         * | A     |     B     |  Answer  |
         * | ======|===========|==========|
         * | True  |   True    |    True  |
         * | True  |   False   |    True  |
         * | False |   True    |    True  |
         * | False |   False   |    False |
         * ================================
         */

         if (a<b && c%2 ==1 ){
             System.out.println("b ios greater than a");
         }

    }
}
