package Object;

import java.io.*;

public class ObjectSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ABC abc = new ABC();
        abc.k = 10;
//create object
        File file = new File("demo.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(abc);
// take to read
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object abc1 = objectInputStream.readObject();
        System.out.println("value of abc 1 : "+ abc1);


    }
}
 /*   Exception in thread "main" java.io.NotSerializableException: Object.ABC
        at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
        at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
        at Object.ObjectSerializationDemo.main(ObjectSerializationDemo.java:16)
*/
// by default java not give chance to save object
// so above error is given
// to remove that error need to implement with serializable interface(Marked interface)

class ABC implements Serializable {
    int k;

    @Override
    public String toString() {
        return "ABC{" +
                "k=" + k +
                '}';
    }
}