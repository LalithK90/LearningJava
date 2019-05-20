package Class;

public class ForNameDemo {
    public static void main(String[] args) throws Exception {
      //  Pqr pqr=new Pqr();
      //  Class.forName("Class.Pqr");
      //  DriverManager.registerDriver(new com.mysql.jdbc.Driver()); // 1 line
        Class.forName("com.mysql.jdbc.Driver"); // 2 line === 1 line

    }
}
class Pqr{
    static {
        System.out.println("In static block");
    }
    //instance
    {
        System.out.println("in instance");
    }
}