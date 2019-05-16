package Encapsulation_Inheritance_Polymorphism_DynamicMethodDispatch;

public class InheritanceDemo {
    public static void main(String[] args) {
        //only add
        Add add = new Add();
        add.num1 = 5;
        add.num2 = 10;
        add.sum();
        System.out.println(add.result);

        //add and subtraction
        AddSub addSub = new AddSub();
        addSub.num1 = 51;
        addSub.num2 = 10;
        addSub.sum();
        System.out.println(addSub.result);
        addSub.sub();
        System.out.println(addSub.result);

        //after Inheritance --> Single level
        ExtendedAddSub extendedAddSub = new ExtendedAddSub();
        extendedAddSub.num1 = 11;
        extendedAddSub.num2 = 4;
        extendedAddSub.sum();
        System.out.println(extendedAddSub.result);
        extendedAddSub.sub();
        System.out.println(extendedAddSub.result);

        //after Inheritance --> Multi - Level level
        ExtendedAddSubMulti extendedAddSubMulti = new ExtendedAddSubMulti();
        extendedAddSubMulti.num1 = 11;
        extendedAddSubMulti.num2 = 4;
        extendedAddSubMulti.sum();
        System.out.println(extendedAddSubMulti.result);
        extendedAddSubMulti.sub();
        System.out.println(extendedAddSubMulti.result);
        extendedAddSubMulti.multi();
        System.out.println(extendedAddSubMulti.result);

    }
}

class Add //Parent, Super, Base
{
    int num1, num2, result = 0;

    public void sum() {
        result = num1 + num2;
    }
}

class AddSub {
    int num1, num2, result = 0;

    public void sum() {
        result = num1 + num2;
    }

    public void sub() {
        result = num1 - num2;
    }
}
// single level inheritance
class ExtendedAddSub extends Add //Child, Sub, Derived
{
    public void sub() {
        result = num1 - num2;
    }
}

//multi-level inheritence
class ExtendedAddSubMulti extends ExtendedAddSub //Child, Sub, Derived
{
    public void multi() {
        result = num1 * num2;
    }
}


    //Multiple --> Java will not support
/*
class Calc extends Add,AddSub{

}*/
