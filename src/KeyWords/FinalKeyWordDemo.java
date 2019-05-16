package KeyWords;

public class FinalKeyWordDemo {
    //Final --> Variable, Method, Class
    public static void main(String[] args) {
        System.out.println("Use final key word to variable \n");
        int a = 5;
        a++;
        System.out.println(a);

        final int b = 10;
        // b++; , b=100; --> can not increment variable value if variable is final
        System.out.println(b);

        System.out.println("\n Use final key word in method level \n");
        Ac ac = new Ac();
        ac.show();
        ac.finalExample();

        System.out.println("\n Use final key word in class level \n");
        System.out.println(" See the code and understand");

    }
}

class Ab {
    public void show() {
        System.out.println("In Ab ");
    }

    final public void finalExample() {
        System.out.println("In Ab final keyword example");
    }

}

class Ac extends Ab {
    public void show() {
        System.out.println("In Ac ");
    }
/*
--> Remove a comment to see
public void finalExample() {
        System.out.println("In Ac ");
    }*/
}

//if put final keyword like this
//final class Ba --> can not extend like follow
class Ba {
    public void show() {
        System.out.println("In Ba ");
    }
}

class Bb extends Ba {
    public void show() {
        System.out.println("In Bb ");
    }
}