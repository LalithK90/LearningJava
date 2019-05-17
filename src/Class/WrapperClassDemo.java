package Class;

import java.util.ArrayList;

public class WrapperClassDemo {
    // primitive --> int ,  float, double, char
    //              Integer, Float, Double, Character
    public static void main(String[] args) {
            int i =5;
            Integer integer = new Integer(10);//Boxing
            Integer integer1 = new Integer(i);//Boxing

        Integer integer2 = 10;//Auto Boxing
        Integer integer3 = i;//Auto Boxing

        int j = integer.intValue(); //Unboxing
        int k = integer; // Auto Unboxing

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);

     // int is speed than integer


    }
}
