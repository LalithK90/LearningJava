package KeyWords;

public class ThisKeyWordDemo {
    public static void main(String[] args) {
        Ca ca = new Ca(6);
        ca.show();
    }
}

class Ca {//Class variable --> static variable
    private int x; //Instance variable

    public Ca(int x) //Local variable
    {
        //  x = x; can identify instance and local variable
        this.x = x; //Current Instance
        //this is used show instance variable
    }

    public void show() {
        System.out.println("x is " + x);
    }
}

class Cb {
}