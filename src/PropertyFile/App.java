package PropertyFile;

        import java.io.*;
        import java.util.Properties;

public class App {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
/*  create == properties file

        File file = new File("app.properties");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        properties.setProperty("url","localhost:3306/javalearningsample" );
        properties.setProperty("uname","root" );
        properties.setProperty("pass","12345" );

        properties.store(fileOutputStream, null);
        */

        InputStream inputStream =new FileInputStream("app.properties");
        properties.load(inputStream);
        System.out.println(properties.getProperty("url"));
        properties.list(System.out);

    }
}
