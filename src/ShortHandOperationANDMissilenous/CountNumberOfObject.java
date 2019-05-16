package ShortHandOperationANDMissilenous;

public class CountNumberOfObject {
    public static void main(String[] args) {
        Abc abc = new Abc();
        Abc abc1 = new Abc();
        Abc abc2 = new Abc();
        Abc abc3 = new Abc();

        abc3.Count();

        abc.Count();
    }
}
class Abc{
    static int a;

    public Abc() {
        a++;
    }
    public void Count(){
        System.out.println("Number of object called "+a);
    }
}