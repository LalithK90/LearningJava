package CharactersPackage;

public class Characters {
    public static void main(String[] args) {
        System.out.println("She said \"Hello!\" to me.");

        System.out.println("\n\n");
        System.out.println("Character Methods");
        isLetter();
        isDigit();
        isWhitespace();
        isUpperCase();
        isLowerCase();
        toLowerCase();
        toUpperCase();
        toStringExample();
    }

    private static void isLetter(){
        System.out.println("isLetter");
        /**Description

         The method determines whether the specified char value is a letter.
         Syntax

         boolean isLetter(char ch)

         Parameters

         Here is the detail of parameters −

         ch − Primitive character type.

         Return Value

         This method returns true if the passed character is really a character.
         */
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('5'));

        System.out.println("\n\n\n");
    }

    private static void isDigit(){
        System.out.println("isDigit");
        /**Description

         The method determines whether the specified char value is a digit.
         Syntax

         boolean isDigit(char ch)

         Parameters

         Here is the detail of parameters −

         ch − Primitive character type.

         Return Value

         This method returns true, if the passed character is really a digit.
         */
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isDigit('5'));

        System.out.println("\n\n\n");
    }

    private static void isWhitespace(){
        System.out.println("isWhitespace");
        /**Description

         The method determines whether the specified char value is a white space, which includes space, tab, or new line.
         Syntax

         boolean isWhitespace(char ch)

         Parameters

         Here is the detail of parameters −

         ch − Primitive character type.

         Return Value

         This method returns true, if the passed character is really a white space.
         */
        System.out.println(Character.isWhitespace('c'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));

        System.out.println("\n\n\n");
    }

    private static void isUpperCase(){
        System.out.println("isUpperCase");
        /**Description

         This method determines whether the specified char value is uppercase.
         Syntax

         boolean isUpperCase(char ch)

         Parameters

         Here is the detail of parameters −

         ch − Primitive character type.

         Return Value

         This method returns true, if the passed character is really an uppercase.
         */
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isUpperCase('\n'));
        System.out.println(Character.isUpperCase('\t'));

        System.out.println("\n\n\n");
    }

    private static void isLowerCase(){
        System.out.println("isLowerCase");
        /**Description

         The method determines whether the specified char value is lowercase.
         Syntax

         boolean isLowerCase(char ch)

         Parameters

         Here is the detail of parameters −

         ch − Primitive character type.

         Return Value

         This method returns true, if the passed character is really in lowercase.
         */
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isLowerCase('C'));
        System.out.println(Character.isLowerCase('\n'));
        System.out.println(Character.isLowerCase('\t'));

        System.out.println("\n\n\n");
    }

    private static void toUpperCase(){
        System.out.println("toUpperCase");
        /**Description

         The method returns the uppercase form of the specified char value.
         Syntax

         char toUpperCase(char ch)

         Parameters

         Here is the detail of parameters −

         ch − Primitive character type.

         Return Value

         This method returns the uppercase form of the specified char value.
         */
        System.out.println(Character.toUpperCase('c'));
        System.out.println(Character.toUpperCase('C'));

        System.out.println("\n\n\n");
    }

    private static void toLowerCase(){
        System.out.println("toLowerCase");
        /**Description

         The method returns the lowercase form of the specified char value.
         Syntax

         char toLowerCase(char ch)

         Parameters

         Here is the detail of parameters −

         ch − Primitive character type.

         Return Value

         This method returns the lowercase form of the specified char value.

         Example*/
        System.out.println(Character.toLowerCase('c'));
        System.out.println(Character.toLowerCase('C'));

        System.out.println("\n\n\n");
    }

    private static void toStringExample(){
        System.out.println("toString Example");
        /**Description

         This method returns a String object representing the specified character value, that is, a one-character string.
         Syntax

         String toString(char ch)

         Parameters

         Here is the detail of parameters −

         ch − Primitive character type.

         Return Value

         This method returns String object.
         */
        System.out.println(Character.toString('c'));
        System.out.println(Character.toString('C'));

        System.out.println("\n\n\n");
    }

}
