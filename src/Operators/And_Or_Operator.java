package Operators;

public class And_Or_Operator {
    public static void main(String[] args) {
        /**
         * AND --> &
         *      & --> 1 1 -> 1 Otherwise 0
         * Or --> |
         *       | --> 0 0 --> 0 Otherwise 1
         */
        int a = 25;     // 1 1 0 0 1
        int b = 15;     // 0 1 1 1 1
        int c = a & b;  // 0 1 0 0 1 --> 9 decimal value
        System.out.println("Decimal value in And operator"+ c +"\n");

        int d = a | b ; // 1 1 1 1 1 --> 31 decimal value
        System.out.println("Decimal value in or operator "+ d);

    }
}
