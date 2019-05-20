package Stream;

interface Actor {
    void act();

    void speak();

    default void comedy() {
        System.out.println("can make dance in interface");
    }
}

public class StreamDemo2 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.act();
        hero.comedy();
        hero.speak();

        Villain villain = new Villain();
        villain.act();
        villain.rude();
        villain.speak();
        villain.comedy();


    }
}

class Hero implements Actor {

    @Override
    public void act() {
        System.out.println("Act");
    }

    @Override
    public void speak() {
        System.out.println("speak");
    }

    public void comedy() {
        System.out.println("comedy");
    }
}

class Villain implements Actor {
    @Override
    public void act() {
        System.out.println("Villain act");
    }

    @Override
    public void speak() {
        System.out.println("Villain speak");
    }

    public void rude() {
        System.out.println("rude");
    }
}