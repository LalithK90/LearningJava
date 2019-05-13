package BinaryLiteral;

public class Example01 {
    public static void main(String[] args) {
        int i = 5;
        int j = 101;
        int k = 0B101;
        int l = 0B100_00_00_00_00_00;
        int m = 0B100_00_00_00_00_00000000000;
        int n = 0b100_00_00_00_00_00000000000;
        System.out.println("Normal Int value " +i);
        System.out.println("Binary value like binary " +j);
        System.out.println("Binary value to Decimal " +k);
        System.out.println("Binary value to Decimal can store value like that " +
                "separate using underscore(_) after two 00 \n" +"Like first "+l+"\n second "+m);
        System.out.println("There is no deference 0B or 0b "+n);
    }
}
