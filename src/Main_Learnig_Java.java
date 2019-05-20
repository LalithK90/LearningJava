/*
Comments

        Java has three kinds of comments: traditional comments, end-of-line comments and documentation comments.

        Traditional comments, also known as block comments, start with */
/* and end with *//*
, they may span across multiple lines. This type of comment was derived from C and C++.

*/
/* This is a multi-line comment.
It may occupy more than one line. *//*


        End-of-line comments start with // and extend to the end of the current line. This comment type is also present in C++ and in modern C.

// This is an end-of-line comment

        Documentation comments in the source files are processed by the Javadoc tool to generate documentation. This type of comment is identical to traditional comments, except it starts with */
/** and follows conventions defined by the Javadoc tool. Technically, these comments are a special kind of traditional comment and they are not specifically defined in the language specification.

 /**
 * This is a documentation comment.
 *
 * @author John Doe
 *//*


*/


public class Main_Learnig_Java {
// Every Java application must have an entry point. This is true of both graphical interface applications and console applications.
// The entry point is the main method. There can be more than one class with a main method,
// but the main class is always defined externally (for example, in a manifest file).
// The method must be static and is passed command-line arguments as an array of strings.
// Unlike C++ or C#, it never returns a value and must return void.
    public static void main(String[] args) {
        // first example
        System.out.println("Java Learning");
    }

}
