package DifferentWayToCreateObject;

public class DifferentWayToCreateObject {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //1 method
        ExampleObject01 exampleObject01 = new ExampleObject01();
        exampleObject01.Show();

        //2nd method
        ExampleObject01 exampleObject011; // need create object to used this

        //clone
        //De-serialization
        //Dependency injection - spring
        //---------------------------------------

//========== Without new key word =============//
        Class cs = Class.forName("LearningJava.rc.DifferentWayToCreateObject.ExampleObject01");
        //When implement like above need make error capturing := error is file is not found exception
        ExampleObject01 exampleObject012 = (ExampleObject01) cs.newInstance();
        exampleObject012.Show();

    }
}
