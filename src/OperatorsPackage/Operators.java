package OperatorsPackage;

public class Operators {
    public static void main(String args[]) {
        ArithmeticOperators();
        RelationalOperators();
        BitwiseOperators();
        LogicalOperators();
        AssignmentOperators();
        ConditionalOperator();
        InstanceofOperator();
    }

    private static void ArithmeticOperators() {
        System.out.println(" Arithmetic Operators Example");
            int a = 10;
            int b = 20;
            int c = 25;
            int d = 25;

            System.out.println("a + b = " + (a + b) );
            System.out.println("a - b = " + (a - b) );
            System.out.println("a * b = " + (a * b) );
            System.out.println("b / a = " + (b / a) );
            System.out.println("b % a = " + (b % a) );
            System.out.println("c % a = " + (c % a) );
            System.out.println("a++   = " +  (a++) );
            System.out.println("b--   = " +  (a--) );

            // Check the difference in d++ and ++d
            System.out.println("d++   = " +  (d++) );
            System.out.println("++d   = " +  (++d) );
        System.out.println("\n\n\n\n\n\n");
        }


    private static void RelationalOperators() {
        System.out.println("Relational Operators");
            int a = 10;
            int b = 20;

            System.out.println("a == b = " + (a == b) );
            System.out.println("a != b = " + (a != b) );
            System.out.println("a > b = " + (a > b) );
            System.out.println("a < b = " + (a < b) );
            System.out.println("b >= a = " + (b >= a) );
            System.out.println("b <= a = " + (b <= a) );
        System.out.println("\n\n\n\n\n\n");

    }

    private static   void BitwiseOperators() {
        System.out.println("Bitwise Operators");
        int a = 60;	/* 60 = 0011 1100 */
        int b = 13;	/* 13 = 0000 1101 */
        int c = 0;

        c = a & b;        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        c = a | b;        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;        /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        c = ~a;           /*-61 = 1100 0011 */
        System.out.println("~a = " + c );

        c = a << 2;       /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;       /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;      /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );

       System.out.println("\n\n\n\n\n\n");
    }


    private static void LogicalOperators() {
        System.out.println("Logical Operators");
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));

        System.out.println("\n\n\n\n\n\n");
    }

    private static void AssignmentOperators() {
        System.out.println("Assignment Operators");
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        System.out.println("c = a + b = " + c );

        c += a ;
        System.out.println("c += a  = " + c );

        c -= a ;
        System.out.println("c -= a = " + c );

        c *= a ;
        System.out.println("c *= a = " + c );

        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );

        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );

        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );

        c &= a ;
        System.out.println("c &= a  = " + c );

        c ^= a ;
        System.out.println("c ^= a   = " + c );

        c |= a ;
        System.out.println("c |= a   = " + c );

        System.out.println("\n\n\n\n\n\n");
    }

    /**
     * Miscellaneous Operators - start
     * */

    private static void ConditionalOperator() {
        System.out.println("Conditional Operator");
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );
        System.out.println("\n\n\n\n\n\n");
    }

    private static void InstanceofOperator() {
        System.out.println("Instanceof Operator - 1");

        String name = "James";

        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );
        System.out.println("\n\n\n\n\n\n");
    }

/*    class Vehicle {}

    public  class Car extends Vehicle {

        public  void InstanceofOperator2() {
            System.out.println("Instanceof Operator - 2");
            Vehicle a = new Car();
            boolean result1 =  a instanceof Car;
            System.out.println( result1 );

            System.out.println("\n\n\n\n\n\n");
        }
    }*/

    /**
     * Miscellaneous Operators - end
     * */

}
