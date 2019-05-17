package String;

public class ToStringMethodDemo {
    public static void main(String[] args) {
        Student student = new Student(1, "Lalith");
        System.out.println(student.toString());
    }
}

class Student {
    int rollNo;
    String sName;

    public Student(int rollNo, String sName) {
        this.rollNo = rollNo;
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                '}';
    }
//    @Override
//    public String toString() {
//        return rollNo + " : " + sName;
//    }
}
