package StaticImport;


//static import
import static java.lang.System.out;
import static StaticImport.Example01.show;

public class StaticAndImport {
    public static void main(String[] args) {
        //System.out.println("Hello world"); --> if import system class in any class can be access
        out.println("Hello world");
        Example01.show(); // example class in same package there for no need to create new object
        out.println("after import the Example01 class ");
        show();
    }
}
