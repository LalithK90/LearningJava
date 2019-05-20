package ArraysPackage;

public class Arrays {
    private static int ints[] = new int[]{3, 1, 2, 6, 4, 2};

    public static void main(String[] args) {
        createArray();
        forEachLoop();
        printArray(ints);

    }

    private static void createArray(){
        System.out.println("Create an array");
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);

        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);

        System.out.println("\n\n\n");
    }

    private static void forEachLoop() {
        System.out.println("For Each Loop");
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        for (double element : myList) {
            System.out.println(element);
            System.out.println("\n\n\n");
        }
    }

    public static void printArray(int[] array) {
        System.out.println(" print Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\n\n");
    }



}
