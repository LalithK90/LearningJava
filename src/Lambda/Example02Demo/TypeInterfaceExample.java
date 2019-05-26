package Lambda.Example02Demo;

public class TypeInterfaceExample {
    public static void main(String[] args) {
        //no need to generic like this
       // StringLengthLambda stringLengthLambda = (String s) -> s.length();
        //StringLengthLambda stringLengthLambda = (s) -> s.length();
        //StringLengthLambda stringLengthLambda = s -> s.length();
      /*  StringLengthLambda stringLengthLambda = String::length;
        System.out.println(stringLengthLambda.getLength("Hello ExampleLambda"));*/

      printLambda(s->s.length());
      printLambda(String::length);

    }
    private static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lalith "));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
