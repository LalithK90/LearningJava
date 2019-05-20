package InnerClassesPackage;

class Outer_Demo3 {
    // private variable of the outer class
    private int num = 175;

    // inner class
    public class Inner_Demo3 {
        public int getNum() {
            System.out.println("This is the getnum method of the inner class");
            return num;
        }
    }
}

public class My_class3 {

    public static void main(String args[]) {
        // Instantiating the outer class
        Outer_Demo3 outer = new Outer_Demo3();

        // Instantiating the inner class
        Outer_Demo3.Inner_Demo3 inner = outer.new Inner_Demo3();
        System.out.println(inner.getNum());
    }
}