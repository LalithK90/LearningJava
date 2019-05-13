package ShortHandOperationANDMissilenous;

public class Example01 {
    public static void main(String[] args) {
        System.out.println("Addition \n");
        int i = 5;
        i = i + 2;
        System.out.println("First method " + i);

        i += 3;
        System.out.println("Second method " + i);

        System.out.println("\n Subtraction \n");
        int j = 3;
        j = j - 1;
        System.out.println("First Method " + j);

        j -= 1;
        System.out.println("Second method " + j);

        System.out.println("\n Multiplication \n");
        int k = 4;
        k = k * 2;
        System.out.println("First Method " + k);

        k *= 2;
        System.out.println("Second method " + k);

        System.out.println("\n Divide \n");
        int l = 4;
        l = l / 2;
        System.out.println("First Method " + l);

        l /= 2;
        System.out.println("Second method " + l);

        System.out.println("\n Modulation \n");
        int m = 9;
        m = m % 2;
        System.out.println("First Method " + m);

        m %= 2;
        System.out.println("Second method " + m);

        System.out.println("\n Considering byte");
        System.out.println("\n Addition \n");
        byte n = 9;
        //following one is not working
        //n = n + 2;
        n = (byte) (n + 2);
        System.out.println("First Method " + n);

        n += 2;
        System.out.println("Second method " + n);

        System.out.println("\n Boolean \n");
        boolean a = false;

        System.out.println("First Method " + a);

        a = !a;
        System.out.println("Second method " + a);
    }
}
