package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionAndGenericsDemo {
    public static void main(String[] args) {
       /* List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 100; i++) {
            list.add(random.nextInt(1000));
        }
        Collections.sort(list, (i1, i2) -> {
            return i1 % 10 > i2 % 10 ? 1 : i1 % 10 < i2 % 10 ? -1 : 0;
        });
        for (Integer integer : list) {
            System.out.println(integer);
        }*/

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, 55));
        students.add(new Student(2, 75));
        students.add(new Student(3, 65));
        students.add(new Student(4, 85));
        students.add(new Student(5, 95));

/* Step -01

 Collections.sort(students, (s1,s2)->{
          return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
        });*/
        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
/*
Step -01

class Student {
     int rolNo;
     int marks;

    public Student(int rolNo, int marks) {
        this.rolNo = rolNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rolNo=" + rolNo +
                ", marks=" + marks +
                '}';
    }
}*/


class Student implements Comparable<Student> {
    private int rolNo;
    private int marks;

    Student(int rolNo, int marks) {
        this.rolNo = rolNo;
        this.marks = marks;
    }

    public int compareTo(Student student) {
        return this.marks > student.marks ? -1 : this.marks < student.marks ? 1 : 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rolNo=" + rolNo +
                ", marks=" + marks +
                '}';
    }


}