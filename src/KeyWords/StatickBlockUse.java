package KeyWords;

public class StatickBlockUse {
    static {
        //This is a static block
        //This is belongs to main method without any reference
        System.out.println("Hello  Lalith");
        System.out.println("out of main 01");
    }

    public static void main(String[] args) {
       // System.out.println("Hello Lalith");

      //not required to called static block it's main method
        System.out.println("in main");
    }
    static {
        System.out.println("out of main 02");
    }
}

