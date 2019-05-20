package Object.SerializeXML;

import java.util.List;

public class College {
    private List<Student> students;

    public College(List<Student> students) {
        this.students = students;
    }

    public College() {

    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
