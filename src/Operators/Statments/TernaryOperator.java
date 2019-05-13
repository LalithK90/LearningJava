package Operators.Statments;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 1;
        int b;
        int c = 2;

        if (a == 1){
            b = 10;
        }else {
            b = 8;
        }
        System.out.println("Normal if else statement using "+b +"\n");

        // using ternary operator
        b = c == 2?6:7;
        System.out.println("Ternary Operator "+b+"\n");

        Object object;
        Object object1;

        if (false){
            object =new Integer(100);
        }else {
            object =new Double(12.00);
        }
        System.out.println(object);

        object1 = true?new Integer(100):new Double(12.00);
        System.out.println("Ternary Operator "+object1 +"\n");
    }
}
