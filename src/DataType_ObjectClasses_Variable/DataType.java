package DataType_ObjectClasses_Variable;

public class DataType {

    /** Following link use to get more details
     *  https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.2
     *  */

    private static boolean aBoolean;
    private static char    aChar;
    private static byte    aByte;
    private static short   aShort;
    private static int     anInt;
    private static long    aLong;
    private static double  aDouble;
    private static float   aFloat;


    private static Integer   integer;
    private static Double   adouble;




    public static void main(String[] args) {
//Static method can only access static variable
        System.out.println("Default Values \n==============");
            System.out.println("Boolean default value "+ aBoolean);
            System.out.println("Char default value " + aChar);
            System.out.println("Byte default value " + aByte);
            System.out.println("Short default value " + aShort);
            System.out.println("Int default value " + anInt);
            System.out.println("Long default value " + aLong);
            System.out.println("Double default value " + aDouble);
            System.out.println("Float default value " + aFloat);
            System.out.println("Integer default value " + integer);
            System.out.println("Double default value " + adouble);

        System.out.println("Max And Min Value \n==============");


            System.out.println("Integer max value " + integer.MAX_VALUE +" Integer max value "+ integer.MIN_VALUE );
            System.out.println("Double max value " + adouble.MAX_VALUE +" Double max value "+ adouble.MIN_VALUE );

           /**
            *  For byte, from -128 to 127, inclusive
            *  For short, from -32768 to 32767, inclusive
            *  For int, from -2147483648 to 2147483647, inclusive
            *  For long, from -9223372036854775808 to 9223372036854775807, inclusive
            *  For char, from '\u0000' to '\uffff' inclusive, that is, from 0 to 65535
            *  */

    }



}
