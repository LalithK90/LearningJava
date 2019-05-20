package DataType_ObjectClasses_Variable;

public class Variable {

    static int staticVarible = 1;
    /** What is Static Variable in Java?
     *
     * Static variable in Java is variable which belongs to the class and initialized only once at the start of the execution.
     *
     *     It is a variable which belongs to the class and not to object(instance)
     *     Static variables are initialized only once, at the start of the execution. These variables will be initialized first, before the initialization of any instance variables
     *     A single copy to be shared by all instances of the class
     *     A static variable can be accessed directly by the class name and doesn’t need any object
     *
     * */
    int instanceVariable = 2;
    /** What is instance variable ?
     *
     * */
    public void methodName(int methodParameter){
        int methodLocalVarable = 3;
       /** What is method variable ?
        *
        * */
        if (true){
            int blockVariable = 4;
            /** Java Static Block

             The static block is a block of statement inside a Java class that will be executed when a class is first loaded into the JVM

             class Test{
             static {
             //Code goes here
             }
             }


             A static block helps to initialize the static data members, just like constructors help to initialize instance members
             *
             * */
        }
    }

    /**What is Static Method in Java?

     Static method in Java is a method which belongs to the class and not to the object. A static method can access only static data.

     It is a method which belongs to the class and not to the object(instance)
     A static method can access only static data. It can not access non-static data (instance variables)
     A static method can call only other static methods and can not call a non-static method from it.
     A static method can be accessed directly by the class name and doesn’t need any object
     A static method cannot refer to "this" or "super" keywords in anyway
     * */

    /**Static Import Statement
     *  The normal import declaration imports classes from packages, so that they can be used without package reference.
     *  Similarly the static import declaration imports static members from classes and allowing them to be used without class reference.
     *  A static import statement also comes in two flavors: single-static
     *  import and static-import-on-demand.
     *  A single-static import declaration imports one static member from a type.
     *  A static-import-on-demand declaration imports all static members of a type.
    * */


    /**
     * Static Class
     * In Java, you can have a static class as inner class.
     * Just like other static members, nested classed belong with class scope so the inner static class can be accessed without having an object of outer class.
         * public class JavaStaticExample
         * {
         *     public static void main(String[] args)
         *     {
         *         //Static inner class example
         *         System.out.println( DataObject.StaticInnerClas.innerStaticVar );
         *     }
         * }
         * class DataObject
         * {
         *     public Integer nonStaticVar;
         *     public static Integer staticVar;    //static variable
         *
         *     static class StaticInnerClas {
         *         Integer innerNonStaticVar = 60;
         *         static Integer innerStaticVar = 70;     //static variable inside inner class
         *     }
         * }
     *
     * Please note that an static inner class cannot access the non-static members of outer class. It can access only static members from outer class.*/

/** Static Summary

 Let’s summarize everything about static keyword usage in Java.

 1. Static members belong to class. No need to create class instance to access static members.
 2. Static members (variables and methods) can be accessed inside static methods and static blocks only.
 3. Non-static members cannot be accessed inside static methods, blocks and inner classes.
 4. A class can have multiple static blocks and they will be executed in order they appear in class definition.
 5. A class can be static only if its declared as inner class inside outer class.
 6. Static imports can be used to import all static members from a class. These members can be referred without any class reference.*/

/**
 * Local Variables
 *
 *     1.Local variables are declared in methods, constructors, or blocks.
 *
 *     2.Local variables are created when the method, constructor or block is entered and the variable will be destroyed once it exits the method, constructor, or block.
 *
 *     3.Access modifiers cannot be used for local variables.
 *
 *     4.Local variables are visible only within the declared method, constructor, or block.
 *
 *     5.Local variables are implemented at stack level internally.
 *
 *     6.There is no default value for local variables, so local variables should be declared and an initial value should be assigned before the first use.
 *     */

/**
 * Instance Variables
 *
 *     1.Instance variables are declared in a class, but outside a method, constructor or any block.
 *
 *     2.When a space is allocated for an object in the heap, a slot for each instance variable value is created.
 *
 *     3.Instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed.
 *
 *     4.Instance variables hold values that must be referenced by more than one method, constructor or block, or essential parts of an object's state that must be present throughout the class.
 *
 *     5.Instance variables can be declared in class level before or after use.
 *
 *     6.Access modifiers can be given for instance variables.
 *
 *     7.The instance variables are visible for all methods, constructors and block in the class. Normally, it is recommended to make these variables private (access level). However, visibility for subclasses can be given for these variables with the use of access modifiers.
 *
 *     8.Instance variables have default values. For numbers, the default value is 0, for Booleans it is false, and for object references it is null. Values can be assigned during the declaration or within the constructor.
 *
 *     9.Instance variables can be accessed directly by calling the variable name inside the class. However, within static methods (when instance variables are given accessibility), they should be called using the fully qualified name. ObjectReference.VariableName.
 *     */

/**
 * Class/Static Variables
 *
 *     1.Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.
 *
 *     2.There would only be one copy of each class variable per class, regardless of how many objects are created from it.
 *
 *     3.Static variables are rarely used other than being declared as constants. Constants are variables that are declared as public/private, final, and static. Constant variables never change from their initial value.
 *
 *     4.Static variables are stored in the static memory. It is rare to use static variables other than declared final and used as either public or private constants.
 *
 *     5.Static variables are created when the program starts and destroyed when the program stops.
 *
 *     6.Visibility is similar to instance variables. However, most static variables are declared public since they must be available for users of the class.
 *
 *     7.Default values are same as instance variables. For numbers, the default value is 0; for Booleans, it is false; and for object references, it is null. Values can be assigned during the declaration or within the constructor. Additionally, values can be assigned in special static initializer blocks.
 *
 *     8.Static variables can be accessed by calling with the class name ClassName.VariableName.
 *
 *     9.When declaring class variables as public static final, then variable names (constants) are all in upper case. If the static variables are not public and final, the naming syntax is the same as instance and local variables.
 *     */

}
