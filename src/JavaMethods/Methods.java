package JavaMethods;

public class Methods {
    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        int c = methodCalling(a, b);
        System.out.println("Minimum Value = " + c);
        System.out.println("\n\n");

        voidKeyWordExample(255.7);

        System.out.println("\n\n");

        int x = 30;
        int y = 45;
        System.out.println("Before swapping, x = " + x + " and y = " + y);

        // Invoke the swap method
        swapFunction(x, y);
        System.out.println("\n**Now, Before and After swapping values will be same here**:");
        System.out.println("After swapping, x = " + x + " and y is " + y);

        System.out.println("\n\n");

        int d = 11;
        int e = 6;
        double f = 7.3;
        double g = 9.4;
        int result1 = minFunction(d, e);

        // same function name with different parameters
        double result2 = minFunction(f, g);
        System.out.println("Minimum Value = " + result1);
        System.out.println("Minimum Value = " + result2);

        System.out.println("\n\n");

        System.out.println("command line argument");
        for(int i = 0; i<args.length; i++) {
            System.out.println("args[" + i + "]: " +  args[i]);

            System.out.println("\n\n\n");
            System.out.println("variable argument");
            // Call method with variable args
            printMax(34, 3, 3, 2, 56.5);
            printMax(new double[]{1, 2, 3});
        }

    }


    /** returns the minimum of two numbers */
    private static int methodCalling(int n1, int n2) {
        System.out.println("Method calling");
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;

    }

    /** void key word example*/
    private static void voidKeyWordExample(double points) {
        System.out.println("void key word example");
        if (points >= 202.5) {
            System.out.println("Rank:A1");
        }else if (points >= 122.4) {
            System.out.println("Rank:A2");
        }else {
            System.out.println("Rank:A3");
        }
    }

    private static void swapFunction(int a, int b) {
        System.out.println("Before swapping(Inside), a = " + a + " b = " + b);

        // Swap n1 with n2
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping(Inside), a = " + a + " b = " + b);
    }

    // for integer
    private static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

    // for double
    private static double minFunction(double n1, double n2) {
        double min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

    // to see this key word example see MethodThis_example.java

    //... == [] in java
    private static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i <  numbers.length; i++)
            if (numbers[i] >  result)
                result = numbers[i];
        System.out.println("The max value is " + result);
    }

    //how to write finalize method
    protected void finalize( ) {
        // finalization code here
    }


}

