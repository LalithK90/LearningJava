package Object.SerializeXML;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeXMLDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setRollno(1);
        student.setSname("Lalith");

        Student student1 = new Student();
        student1.setSname("Asanka");
        student1.setRollno(2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);

        College college = new College();
        college.setStudents(studentList);

        try {
            XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollage.xml")));
        xmlEncoder.writeObject(college);
        xmlEncoder.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
