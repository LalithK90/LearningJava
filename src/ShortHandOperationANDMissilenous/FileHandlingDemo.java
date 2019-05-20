package ShortHandOperationANDMissilenous;

        import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeUTF("Hello world - lalith");

        FileInputStream inputStream = new FileInputStream("demo.txt");
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String str = dataInputStream.readUTF();
        System.out.println(str);

    }
}
