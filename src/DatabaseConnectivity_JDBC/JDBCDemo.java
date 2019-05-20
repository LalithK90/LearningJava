package DatabaseConnectivity_JDBC;

import java.sql.*;

//RDBMS(Relational Database management system) --> MySql ,SQL, Oracle,
//Bigdata --> NoSql,Mongo
public class JDBCDemo {
    //JDBC procedure
    //==========================//
    // 1 import the package (java.sql.*)
    // 2 cord     | the driver     (com.mysql.jdbcDriver)
    //   register |
    // 3 Establish the connection
    // 4 Create the statement --> Statement , Prepared statement, Callback Statement
    // 5 Execute the quarry
    // 6 Process result
    // 7 Close the connection
/*public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/javalearningsample";
        String uname = "root";
        String pas = "12345";
        String quarry = "select * from student";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, uname, pas);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(quarry);

        resultSet.next();
        String sname = resultSet.getString("sname");
        System.out.println(sname);

        statement.close();
        connection.close();

    }
    */
/*
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/javalearningsample";
        String uname = "root";
        String pas = "12345";
        String quarry = "select * from student";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, uname, pas);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(quarry);

        String stData = "";

        *//*
        resultSet.next();
        stData = resultSet.getInt("roolNo") +" : "+ resultSet.getString("sname");

        resultSet.next();
        stData = resultSet.getInt("roolNo") +" : "+ resultSet.getString("sname");

        System.out.println(stData);
        */
/*

        while (resultSet.next()) {
            stData = resultSet.getInt("roolNo") + " : " + resultSet.getString("sname");
            System.out.println(stData);
        }


        statement.close();
        connection.close();

    }
    */
/*    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/javalearningsample";
        String uname = "root";
        String pas = "12345";
        String quarry = "insert into student values(6,'Kasun')";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, uname, pas);
        Statement statement = connection.createStatement(); //prepared statement {for list to send DB}
        int count = statement.executeUpdate(quarry); //DDL, DML (Value change), DQL

        System.out.println(count+"  row/s affected");

        statement.close();
        connection.close();

    }*/
/*    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/javalearningsample";
        String uname = "root";
        String pas = "12345";
        int rollNo = 7;
        String sname ="Dhammika";
        String quarry = "insert into student values (?,?)";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, uname, pas);
        PreparedStatement statement = connection.prepareStatement(quarry);
        statement.setInt(1, rollNo);
        statement.setString(2, sname);
        int count = statement.executeUpdate(); //DDL, DML (Value change), DQL

        System.out.println(count+"  row/s affected");



        statement.close();
        connection.close();

    }*/
/* public static void main(String[] args) throws Exception {

        StudentDAO studentDAO = new StudentDAO();
        Student1 student1 = studentDAO.getStudent(5);
        System.out.println(student1.sname);


    }
}

class StudentDAO {
    public Student1 getStudent(int roolNo) {

        try {
            Student1 student = new Student1();
            student.roolNo = roolNo;
            String url = "jdbc:mysql://localhost:3306/javalearningsample";
            String uname = "root";
            String pas = "12345";
            String quarry = "select sname from student where roolNo=" + roolNo;

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, uname, pas);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(quarry);

            resultSet.next();
            String sname = resultSet.getString("sname");
            System.out.println(sname);

            statement.close();
            connection.close();
            return student;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

class Student1 {
    int roolNo;
    String sname;
}
*/

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();
        Student1 student1 = new Student1();
        student1.roolNo = 8;
        student1.sname = "Isuru";
        studentDAO.connect();
        studentDAO.addStudent(student1);


    }
}

class StudentDAO {


    String url = "jdbc:mysql://localhost:3306/javalearningsample";
    String uname = "root";
    String pas = "12345";
    Connection connection;

    public void connect() {
        try {Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, uname, pas);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Student1 getStudent(int roolNo) {

        try {
            Student1 student = new Student1();
            student.roolNo = roolNo;

            String quarry = "select sname from student where roolNo=" + roolNo;

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(quarry);

            resultSet.next();
            String sname = resultSet.getString("sname");
            System.out.println(sname);

            statement.close();
            connection.close();
            return student;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addStudent(Student1 student1) {

        PreparedStatement preparedStatement;

        try {
            String quarry = "insert into student values (?,?)";
            preparedStatement = connection.prepareStatement(quarry);
            preparedStatement.setInt(1, student1.roolNo);
            preparedStatement.setString(2, student1.sname);
            preparedStatement.executeUpdate();

    /*        preparedStatement.close();
            connection.close();*/
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

class Student1 {
    int roolNo;
    String sname;


}