package Operators;

public class LeftAndRightShift {
    public static void main(String[] args) {
        /**
         * Left shift operator  <<
         * Right shift operator  >>
         */
        int a = 8;      // 1 0 0 0
        int b = a << 2; // 1 0 0 0 0 0 (Add two more Zero) --> 32
        System.out.println("Left shift operator number is " + b);
        int c = a >> 2; // 1 0 (Remove two zero ) --> 2 ( When it is removed don't care 0 or 1 )
        System.out.println("Right shift operator number is "+ c);

    }
}
