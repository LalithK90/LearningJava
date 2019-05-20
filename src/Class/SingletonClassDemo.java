package Class;

public class SingletonClassDemo {
    public static void main(String[] args) {
/*
        //Singleton demo

        ABC abc = ABC.getInstance();
*/
/*
        //Singleton Lazy instantiation
        ABC abc = ABC.getInstance();
        ABC abc1 = ABC.getInstance();
*/
/*
        //Singleton Synchronized
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                ABC abc = ABC.getInstance();
            }
        });
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                ABC abc = ABC.getInstance();
            }
        });
        thread.start();
        thread1.start();
*/
/*        //Singleton Double check locking
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ABC abc = ABC.getInstance();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ABC abc = ABC.getInstance();
            }
        });
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();*/
        //Singleton Enum INSTANCE
        ABC abc = ABC.INSTANCE;
        abc.i = 10;
        abc.show();

        ABC abc1 = ABC.INSTANCE;
        abc1.i = 5;
        abc1.show();


    }
}

/*

//Singleton demo
class ABC {
    static ABC abc = new ABC();

    private ABC() {
    }

    public static ABC getInstance() {
        return abc;
    }
}
*/
/*

//Singleton Lazy instantiation
class ABC {
    public static ABC abc = new ABC(); // Default Eager
    int i;

    private ABC() {
        System.out.println("instanced created");
    }

    public static ABC getInstance() {
        if (abc ==null){
        //Lazy instantiation
        abc = new ABC();
        }
        return abc;
    }
}*/
/*


//Singleton Synchronized
class ABC {
    public static ABC abc = new ABC();

    private ABC() {
        System.out.println("instanced created");
    }

    //public static synchronized ABC getInstance() //
    public static ABC getInstance() //Double check locking
    {
        if (abc ==null){
            abc = new ABC();}
        return abc;
    }
}
*/
/*


//Singleton Double check locking
class ABC {
    public static ABC abc = new ABC();

    private ABC() {
        System.out.println("instanced created");
    }

    public static ABC getInstance() //Double check locking
    {
        if (abc == null) {
            synchronized (ABC.class) {
                if (abc == null)
                    abc = new ABC();
            }
        }
        return abc;
    }
}
*/


//Singleton Enum INSTANCE
enum ABC //Special type of enum
{
   INSTANCE;
   int i;
   public void show(){
       System.out.println("in enum  "+i);
   }

}