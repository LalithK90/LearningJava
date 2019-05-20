package Object.SerializeXML;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeSerializeXMLDemo {
    public static void main(String[] args) {
        try {
            XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("myCollage.xml")));
        College college = (College) xmlDecoder.readObject();
            List<Student> studentList = college.getStudents();
            for(Student  s : studentList){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
