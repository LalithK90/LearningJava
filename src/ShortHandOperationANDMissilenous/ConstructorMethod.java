package ShortHandOperationANDMissilenous;

import sun.rmi.runtime.NewThreadAction;

public class ConstructorMethod {
    /*Constructor Method
    ==================
    1   Member method
    2   Same name as Class name
    3   It will never return Anything
    4   It will be used to allocate memory

    */
    public static void main(String[] args) {
        Sample sample = new Sample(); // Called default Constructor
        Sample sample1 = new Sample(10);
        Sample sample2 = new Sample(10, 19);
    }
//** constructor over loading
    static class Sample {
        // **
        public Sample() {
            System.out.println("Constructor");
        }

        //  **
        public Sample(int a) {
            System.out.println("Constructor " + a);
        }
        //  **
        public Sample(int a, int b) {
            System.out.println("Constructor " + a + " and " + b);
        }
    }
}
