package ErrorHandling;

public class DefinedException {
    public static void main(String[] args) {
        int i = 5;
        try {
            if (i < 10) {

                //  throw new Exception(); -->Output java.lang.Exception
                //throw new Exception("What u noted that will display"); java.lang.Exception: What u noted that will display
                throw new MyException("What u noted that will display using own exception class ");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}