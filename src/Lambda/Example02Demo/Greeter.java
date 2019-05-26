package Lambda.Example02Demo;


public class Greeter {
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

    }
}
