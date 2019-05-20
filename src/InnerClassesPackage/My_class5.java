package InnerClassesPackage;

// interface
interface Message {
    String greet();
}

public class My_class5 {

    // method which accepts the object of interface Message
    public void displayMessage(Message m) {
        System.out.println("Anonymous Inner Class"+"\n");
        System.out.println(m.greet() +
                ", This is an example of anonymous inner class as an argument");
    }

    public static void main(String args[]) {
        // Instantiating the class
        My_class5 obj = new My_class5();

        // Passing an anonymous inner class as an argument
        obj.displayMessage(new Message() {
            public String greet() {
                return "Hello";
            }
        });
    }
}