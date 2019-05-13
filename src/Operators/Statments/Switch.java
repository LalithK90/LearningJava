package Operators.Statments;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Using normal IF Statement to do that ");
        int a = 4;
        if (a == 1) {
            System.out.println("Value is one");
        }
        if (a == 2) {
            System.out.println("Value is two");
        }
        if (a == 3) {
            System.out.println("Value is three");
        }
        if (a == 4) {
            System.out.println("Value is four");
        }
        if (a == 5) {
            System.out.println("Value is five");
        }

        System.out.println("\n Using switch statement \n without break");
        int b = 2;
        switch (b) {
            case 1:
                System.out.println("Value is one");
            case 2:
                System.out.println("Value is two");
            case 3:
                System.out.println("Value is three");
            case 4:
                System.out.println("Value is four");
            case 5:
                System.out.println("Value is five");
        }
        System.out.println("\n Using switch statement \n without default");


        int c =7;
        switch (c) {
            case 1:
                System.out.println("Value is one");
                break;
            case 2:
                System.out.println("Value is two");
                break;
            case 3:
                System.out.println("Value is three");
                break;
            case 4:
                System.out.println("Value is four");
                break;
            case 5:
                System.out.println("Value is five");
                break;
        }

        System.out.println("\n Using switch statement \n");
        int d =7;
        switch (d) {
            case 1:
                System.out.println("Value is one");
                break;
            case 2:
                System.out.println("Value is two");
                break;
            case 3:
                System.out.println("Value is three");
                break;
            case 4:
                System.out.println("Value is four");
                break;
            case 5:
                System.out.println("Value is five");
                break;
            default:
                System.out.println("Greater than five");
        }
    }
}
