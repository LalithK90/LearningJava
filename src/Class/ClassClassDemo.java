package Class;
class Abc{}
class A extends Abc{

}

public class ClassClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cs = Class.forName("Class.A");
        System.out.println(cs.getSuperclass());
    }

}
