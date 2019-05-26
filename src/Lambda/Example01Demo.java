package Lambda;

public class Example01Demo {
    public static void main(String[] args) {
        Greeter greeter = new Greeter(); //when create new object already include it's constructor
        greeter.greeter();
    }
}
class Greeter{
 public void greeter(){
     System.out.println("Hello lambda learning");
 }

    public Greeter() {
        System.out.println(" on constr");
    }
}
