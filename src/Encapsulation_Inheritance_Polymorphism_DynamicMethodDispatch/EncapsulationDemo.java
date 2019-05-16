package Encapsulation_Inheritance_Polymorphism_DynamicMethodDispatch;

public class EncapsulationDemo {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.empId = 1;
        employee.empName = "Lalith";

        Employee employee1 = new Employee();
        employee1.empId = 2;
        employee1.empName = "Asanka";

        Employee employee2 = new Employee();
        employee2.empId = 3;
        employee2.empName = "Numan";

        /*When employee class variable become private */


/*
//Please remove the comment and see can not add value
  Employee1 employee11 = new Employee1();
        employee11.empId = 1;
        employee11.empName = "Lalith";

        Employee1 employee12 = new Employee1();
        employee12.empId = 2;
        employee12.empName = "Asanka";

        Employee1 employee13 = new Employee1();
        employee13.empId = 3;
        employee13.empName = "Numan";*/

        /*After creating getters and setters */
        Employee2 employee21 = new Employee2();
        employee21.setEmpId(1);
        employee21.setEmpName( "Lalith");
        System.out.println(employee21.getEmpId() +" "+ employee21.getEmpName());

        Employee2 employee22 = new Employee2();
        employee22.setEmpId(2);
        employee22.setEmpName("Asanka");
        System.out.println(employee22.getEmpId() +" "+ employee22.getEmpName());

        Employee2 employee23 = new Employee2();
        employee23.setEmpId(3);
        employee23.setEmpName("Numan");
        System.out.println(employee23.getEmpId() +" "+ employee23.getEmpName());

    }
}


class Employee {
    int empId;
    String empName;
}

class Employee1 {
    private int empId;
    private String empName;
}
class Employee2 {
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}