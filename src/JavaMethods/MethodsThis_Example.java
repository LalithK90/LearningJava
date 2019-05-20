package JavaMethods;

public class MethodsThis_Example {
    // Instance variable num
    int num = 10;

    MethodsThis_Example() {
        System.out.println("This is an example program on keyword this");
    }

    MethodsThis_Example(int num) {
        // Invoking the default constructor
        this();

        // Assigning the local variable num to the instance variable num
        this.num = num;
    }

    public void greet() {
        System.out.println("Hi Welcome to Learning Java");
    }

    public void print() {
        // Local variable num
        int num = 20;

        // Printing the local variable
        System.out.println("value of local variable num is : "+num);

        // Printing the instance variable
        System.out.println("value of instance variable num is : "+this.num);

        // Invoking the greet method of a class
        this.greet();
    }

    public static void main(String[] args) {
        // Instantiating the class
        MethodsThis_Example obj1 = new MethodsThis_Example();

        // Invoking the print method
        obj1.print();

        // Passing a new value to the num variable through parametrized constructor
        MethodsThis_Example obj2 = new MethodsThis_Example(30);

        // Invoking the print method again
        obj2.print();
    }
}