package NumbersPackage;

import java.util.Random;

public class Numbers {
    public static void main(String args[]) {

        Integer x = 5; // boxes int to an Integer object
        x =  x + 10;   // unboxes the Integer to a int
        System.out.println(x);

        System.out.println("Number Method");
        xxxValue();
        compareTO();
        equal();
        valueOf();
        stringOf();
        paraseInt();
        absoluteValue();
        ceilMethod();
        floor();
        rint();
        round();
        min();
        max();
        exp();
        random();
        toRadians();
        toDegrees();
        atan();
        atan2();
        acos();
        asin();
        tan();
        cos();
        sin();
        sqrt();
        pow();
        log();

    }
    /*NUmber Method - start */
    private static void xxxValue() {
        /**Description

         The method converts the value of the Number Object that invokes the method to the primitive data type that is returned from the method.
         Syntax

         Here is a separate method for each primitive data type −

         byte byteValue()
         short shortValue()
         int intValue()
         long longValue()
         float floatValue()
         double doubleValue()

         Parameters

         Here is the detail of parameters −

         All these are default methods and accepts no parameter.

         Return Value

         This method returns the primitive data type that is given in the signature.
         */
        Integer x = 5;

        // Returns byte primitive data type
        System.out.println( x.byteValue() );

        // Returns double primitive data type
        System.out.println(x.doubleValue());

        // Returns long primitive data type
        System.out.println( x.longValue() );

        System.out.println("\n\n\n");
    }

    private static void compareTO(){
        System.out.println("Compare to ");
        /**
         * Description
         *
         * The method compares the Number object that invoked the method to the argument. It is possible to compare Byte, Long, Integer, etc.
         *
         * However, two different types cannot be compared, both the argument and the Number object invoking the method should be of the same type.
         * Syntax
         *
         * public int compareTo( NumberSubClass referenceName )
         *
         * Parameters
         *
         * Here is the detail of parameters −
         *
         *     referenceName − This could be a Byte, Double, Integer, Float, Long, or Short.
         *
         * Return Value
         *
         *     If the Integer is equal to the argument then 0 is returned.
         *     If the Integer is less than the argument then -1 is returned.
         *     If the Integer is greater than the argument then 1 is returned.
         *     */
        Integer x = 5;

        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));
        System.out.println("\n\n\n");
    }

    private static void equal(){
        /**Description

         The method determines whether the Number object that invokes the method is equal to the object that is passed as an argument.
         Syntax

         public boolean equals(Object o)

         Parameters

         Here is the detail of parameters −

         Any object.

         Return Value

         The method returns True if the argument is not null and is an object of the same type and with the same numeric value. There are some extra requirements for Double and Float objects that are described in the Java API documentation.
         */
        Integer x = 5;
        Integer y = 10;
        Integer z =5;
        Short a = 5;

        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));

        System.out.println("\n\n\n");
    }

    private static void valueOf(){
        System.out.println("Value of");
        /**Description

         The valueOf method returns the relevant Number Object holding the value of the argument passed. The argument can be a primitive data type, String, etc.

         This method is a static method. The method can take two arguments, where one is a String and the other is a radix.
         Syntax

         Following are all the variants of this method −

         static Integer valueOf(int i)
         static Integer valueOf(String s)
         static Integer valueOf(String s, int radix)

         Parameters

         Here is the detail of parameters −

         i − An int for which Integer representation would be returned.

         s − A String for which Integer representation would be returned.

         radix − This would be used to decide the value of returned Integer based on the passed String.

         Return Value

         valueOf(int i) − This returns an Integer object holding the value of the specified primitive.

         valueOf(String s) − This returns an Integer object holding the value of the specified string representation.

         valueOf(String s, int radix) − This returns an Integer object holding the integer value of the specified string representation, parsed with the value of radix.
         */
        Integer x =Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");
        Integer b = Integer.valueOf("444",16);

        System.out.println(x);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        System.out.println("\n\n\n");
    }

    private static void stringOf(){
        System.out.println("String of");
        /**Description

         The method is used to get a String object representing the value of the Number Object.

         If the method takes a primitive data type as an argument, then the String object representing the primitive data type value is returned.

         If the method takes two arguments, then a String representation of the first argument in the radix specified by the second argument will be returned.
         Syntax

         Following are all the variants of this method −

         String toString()
         static String toString(int i)

         Parameters

         Here is the detail of parameters −

         i − An int for which string representation would be returned.

         Return Value

         toString() − This returns a String object representing the value of this Integer.

         toString(int i) − This returns a String object representing the specified integer.
         */
        Integer x = 5;

        System.out.println(x.toString());
        System.out.println(Integer.toString(12));

        System.out.println("\n\n\n");
    }

    private static void paraseInt(){
        System.out.println("ParaseIn ");
        /**Description

         This method is used to get the primitive data type of a certain String. parseXxx() is a static method and can have one argument or two.
         Syntax

         Following are all the variants of this method −

         static int parseInt(String s)
         static int parseInt(String s, int radix)

         Parameters

         Here is the detail of parameters −

         s − This is a string representation of decimal.

         radix − This would be used to convert String s into integer.

         Return Value

         parseInt(String s) − This returns an integer (decimal only).

         parseInt(int i) − This returns an integer, given a string representation of decimal, binary, octal, or hexadecimal (radix equals 10, 2, 8, or 16 respectively) numbers as input.
         */
        int x =Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int b = Integer.parseInt("444",16);

        System.out.println(x);
        System.out.println(c);
        System.out.println(b);

        System.out.println("\n\n\n");
    }

    private static void absoluteValue(){
        System.out.println("Absolute value");
        /**Description

         The method gives the absolute value of the argument. The argument can be int, float, long, double, short, byte.
         Syntax

         Following are all the variants of this method −

         double abs(double d)
         float abs(float f)
         int abs(int i)
         long abs(long lng)

         Parameters

         Here is the detail of parameters −

         Any primitive data type.

         Return Value

         This method Returns the absolute value of the argument.
         */
        Integer a = -8;
        double d = -100;
        float f = -90;

        System.out.println(Math.abs(a));
        System.out.println(Math.abs(d));
        System.out.println(Math.abs(f));

        System.out.println("\n\n\n");
    }

    private static void ceilMethod(){
        System.out.println("Ceil Method");
        /**Description

         The method ceil gives the smallest integer that is greater than or equal to the argument.
         Syntax

         This method has the following variants −

         double ceil(double d)
         double ceil(float f)

         Parameters

         Here is the detail of parameters −

         A double or float primitive data type.

         Return Value

         This method returns the smallest integer that is greater than or equal to the argument. Returned as a double.
         */
        double d = -100.675;
        float f = -90;

        System.out.println(Math.ceil(d));
        System.out.println(Math.ceil(f));

        System.out.println(Math.floor(d));
        System.out.println(Math.floor(f));

        System.out.println("\n\n\n");
    }

    private static void floor(){
        System.out.println("Floor");
        /**Description

         The method floor gives the largest integer that is less than or equal to the argument.
         Syntax

         This method has the following variants −

         double floor(double d)
         double floor(float f)

         Parameters

         Here is the detail of parameters −

         A double or float primitive data type.

         Return Value

         This method returns the largest integer that is less than or equal to the argument. Returned as a double.
         */
        double d = -100.675;
        float f = -90;

        System.out.println(Math.floor(d));
        System.out.println(Math.floor(f));

        System.out.println(Math.ceil(d));
        System.out.println(Math.ceil(f));

        System.out.println("\n\n\n");
    }

    private static void rint(){
        System.out.println("Rint");
        /**Description

         The method rint returns the integer that is closest in value to the argument.
         Syntax

         double rint(double d)

         Parameters

         Here is the detail of parameters −

         d − it accepts a double value as parameter.

         Return Value

         This method returns the integer that is closest in value to the argument. Returned as a double.
         */
        double d = 100.675;
        double e = 100.500;
        double f = 100.200;

        System.out.println(Math.rint(d));
        System.out.println(Math.rint(e));
        System.out.println(Math.rint(f));

        System.out.println("\n\n\n");
    }

    private static void round(){
        System.out.println("Round");
        /**
         * Description
         *
         * The method round returns the closest long or int, as given by the methods return type.
         * Syntax
         *
         * This method has the following variants −
         *
         * long round(double d)
         * int round(float f)
         *
         * Parameters
         *
         * Here is the detail of parameters −
         *
         *     d − A double or float primitive data type.
         *
         *     f − A float primitive data type.
         *
         * Return Value
         *
         *     This method returns the closest long or int, as indicated by the method's return type, to the argument.
         *     */
        double d = 100.675;
        double e = 100.500;
        float f = 100;
        float g = 90f;

        System.out.println(Math.round(d));
        System.out.println(Math.round(e));
        System.out.println(Math.round(f));
        System.out.println(Math.round(g));

        System.out.println("\n\n\n");
    }

    private static void min(){
        System.out.println("Min");
        /**Description

         The method gives the smaller of the two arguments. The argument can be int, float, long, double.
         Syntax

         This method has the following variants −

         double min(double arg1, double arg2)
         float min(float arg1, float arg2)
         int min(int arg1, int arg2)
         long min(long arg1, long arg2)

         Parameters

         Here is the detail of parameters −

         This method accepts any primitive data type as a parameter.

         Return Value

         This method returns the smaller of the two arguments.
         */
        System.out.println(Math.min(12.123, 12.456));
        System.out.println(Math.min(23.12, 23.0));

        System.out.println("\n\n\n");
    }

    private static void max(){
        System.out.println("Max");
        /**Description

         This method gives the maximum of the two arguments. The argument can be int, float, long, double.
         Syntax

         This method has the following variants −

         double max(double arg1, double arg2)
         float max(float arg1, float arg2)
         int max(int arg1, int arg2)
         long max(long arg1, long arg2)

         Parameters

         Here is the detail of parameters −

         This method accepts any primitive data type as a parameter.

         Return Value

         This method returns the maximum of the two arguments.
         */
        System.out.println(Math.max(12.123, 12.456));
        System.out.println(Math.max(23.12, 23.0));

        System.out.println("\n\n\n");
    }

    private static void exp(){
        System.out.println("Exp method");

        /**Description

     The method returns the base of the natural logarithms, e, to the power of the argument.
     Syntax

     double exp(double d)

     Parameters

     Here is the detail of parameters −

     d − Any primitive data type.

     Return Value

     This method returns the base of the natural logarithms, e, to the power of the argument.*/
        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of e is %.4f%n", Math.E);
        System.out.printf("exp(%.3f) is %.3f%n", x, Math.exp(x));

        System.out.println("\n\n\n");
    }

    private static void random(){
        System.out.println("Random");
        /**Description

         The method is used to generate a random number between 0.0 and 1.0. The range is: 0.0 =< Math.random < 1.0. Different ranges can be achieved by using arithmetic operations.
         Syntax

         static double random()

         Parameters

         Here is the detail of parameters −

         This is a default method and accepts no parameter.

         Return Value

         This method returns a double.
         */
        System.out.println("Number 1 "+ Math.random() );
        System.out.println("Number 2 "+ Math.random() );

        Random rn = new Random();

        for(int i =0; i < 100; i++)
        {
            int answer = rn.nextInt(10) + 1;
            System.out.println("When random number between 10 "+answer);
        }


        System.out.println("\n\n\n");
    }

    private static void toRadians(){
        System.out.println("toRadians()");
        /**Description

         The method converts the argument value to radians.
         Syntax

         double toRadians(double d)

         Parameters

         Here is the detail of parameters −

         d − A double data type.

         Return Value

         This method returns a double value.
         */
        double x = 45.0;
        double y = 30.0;

        System.out.println( Math.toRadians(x) );
        System.out.println( Math.toRadians(y) );

        System.out.println("\n\n\n");
    }

    private static void toDegrees(){
        System.out.println("toDegrees");
        /**Description

         The method converts the argument value to degrees.
         Syntax

         double toDegrees(double d)

         Parameters

         Here is the detail of parameters −

         d − A double data type.

         Return Value

         This method returns a double value.
         */
        double x = 45.0;
        double y = 30.0;

        System.out.println( Math.toDegrees(x) );
        System.out.println( Math.toDegrees(y) );

        System.out.println("\n\n\n");
    }

    private static void atan2(){
        System.out.println("atan2");
        /**Description

         The method converts rectangular coordinates (x, y) to polar coordinate (r, theta) and returns theta.
         Syntax

         double atan2(double y, double x)

         Parameters

         Here is the detail of parameters −

         X − X co-ordinate in double data type.

         Y − Y co-ordinate in double data type.

         Return Value

         This method returns theta from polar coordinate (r, theta).
         */
        double x = 45.0;
        double y = 30.0;

        System.out.println( Math.atan2(x, y) );

        System.out.println("\n\n\n");
    }

    private static void atan(){
        System.out.println("atan");
        /**Description

         The method returns the arctangent of the specified double value.
         Syntax

         double atan(double d)

         Parameters

         Here is the detail of parameters −

         d − A double data type.

         Return Value

         This method returns the arctangent of the specified double value.
         */
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.format("The value of pi is very very very approximately %.4f%n", Math.PI);
        System.out.format("The arctangent of %.4f is %.4f degrees %n", Math.cos(radians),
                Math.toDegrees(Math.atan(Math.sin(radians))));

        System.out.println("\n\n\n");
    }

    private static void acos(){
        System.out.println("acos");
        /**Description

         The method returns the arccosine of the specified double value.
         Syntax

         double acos(double d)

         Parameters

         Here is the detail of parameters −

         d − A double data type.

         Return Value

         This method returns the arccosine of the specified double value.
         */
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The arccosine of %.4f is %.4f degrees %n", Math.cos(radians),
                Math.toDegrees(Math.acos(Math.cos(radians))));

        System.out.println("\n\n\n");
    }

    private static void asin(){
        System.out.println("asin");
        /**Description

         The method returns the arcsine of the specified double value.
         Syntax

         double asin(double d)

         Parameters

         Here is the detail of parameters −

         d − A double data types.

         Return Value

         This method returns the arcsine of the specified double value.
         */
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The arcsine of %.4f is %.4f degrees %n", Math.sin(radians),
                Math.toDegrees(Math.asin(Math.sin(radians))));

        System.out.println("\n\n\n");
    }

    private static void tan(){
        System.out.println("tan");
        /**Description

         The method returns the tangent of the specified double value.
         Syntax

         double tan(double d)

         Parameters

         Here is the detail of parameters −

         d − A double data type.

         Return Value

         This method returns the tangent of the specified double value.
         */
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The tangent of %.1f degrees is %.4f%n", degrees, Math.tan(radians));

        System.out.println("\n\n\n");
    }

    private static void cos(){
        System.out.println("cos");
        /**Description

         The method returns the cosine of the specified double value.
         Syntax

         double cos(double d)

         Parameters

         Here is the detail of parameters −

         d − This method accepts a value of double data type.

         Return Value

         This method returns the cosine of the specified double value.
         */
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The cosine of %.1f degrees is %.4f%n", degrees, Math.cos(radians));
        System.out.println("\n\n\n");
    }

    private static void sin(){
        System.out.println("sin");
        /**Description

         The method returns the sine of the specified double value.
         Syntax

         double sin(double d)

         Parameters

         Here is the detail of parameters −

         d − A double data type.

         Return Value

         This method returns the sine of the specified double value.
         */
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.format("The value of pi is %.4f%n", Math.PI);
        System.out.format("The sine of %.1f degrees is %.4f%n", degrees, Math.sin(radians));

        System.out.println("\n\n\n");
    }

    private static void sqrt(){
        System.out.println("sqrt");
        /**Description

         The method returns the square root of the argument.
         Syntax

         double sqrt(double d)

         Parameters

         Here is the detail of parameters −

         d − Any primitive data type.

         Return Value

         This method returns the square root of the argument.
         */

        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of e is %.4f%n", Math.E);
        System.out.printf("sqrt(%.3f) is %.3f%n", x, Math.sqrt(x));

        System.out.println("\n\n\n");
    }

    private static void pow(){
        System.out.println("pow");
        /**Description

         The method returns the value of the first argument raised to the power of the second argument.
         Syntax

         double pow(double base, double exponent)

         Parameters

         Here is the detail of parameters −

         base − Any primitive data type.

         exponenet − Any primitive data type.

         Return Value

         This method returns the value of the first argument raised to the power of the second argument.
         */

        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of e is %.4f%n", Math.E);
        System.out.printf("pow(%.3f, %.3f) is %.3f%n", x, y, Math.pow(x, y));

        System.out.println("\n\n\n");
    }

    private static void log(){
        System.out.println("log");
        /**Description

         The method returns the natural logarithm of the argument.
         Syntax

         double log(double d)

         Parameters

         Here is the detail of parameters −

         d − Any primitive data type.

         Return Value

         This method returns the natural logarithm of the argument.
         */

        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of e is %.4f%n", Math.E);
        System.out.printf("log(%.3f) is %.3f%n", x, Math.log(x));

        System.out.println("\n\n\n");
    }

    /*NUmber Method - end */
}
