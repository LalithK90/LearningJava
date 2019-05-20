package Object;

public class ObjectCloningDemo {
    /*
    1. Shallow
    2. Deep
    3. Clone

    */
    public static void main(String[] args) throws CloneNotSupportedException {
        Abc abc = new Abc();
        abc.j = 5;
        abc.k = 10;
        System.out.println(abc); // 5,10

        //Shallow
        Abc abc1 = abc;
        abc1.j = 8;
        System.out.println(abc1); //8,10

        //Deep
        Abc abc2 = new Abc();
        abc2.j = abc.j;
        abc2.k = abc.k;
        abc2.j = 25;
        System.out.println(abc2);// 25, 10
        //Clone
        Abc abc3 =(Abc) abc.clone();
        abc3.j =100;
        System.out.println(abc3);//100, 10



    }
}

class Abc implements Cloneable//--> Cloneable is marked Interface(markerInterface)
{
    //By default java not support to cloning hence Class implements with Cloneable
    int j;
    int k;

    @Override
    public String toString() {
        return "Abc{" +
                "j=" + j +
                ", k=" + k +
                '}';
    }
    // following method without never work clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}