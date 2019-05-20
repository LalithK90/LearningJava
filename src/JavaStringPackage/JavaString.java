package JavaStringPackage;

import java.io.UnsupportedEncodingException;

public class JavaString {
    public static void main(String[] args) {
        charAt();
        compareTo();
        compareToMethod();
        compareToIgnoreCase();
        concat();
        contentEquals();
        copyValueOf();
        copyValueOf1();
        endsWith();
        equals();
        equalsIgnoreCase();
        getBytes();
        getBytes1();
        getChars();
        hashCode1();
        indexOf();
        indexOf1();
        indexOf2();
        indexOf3();
        intern();
        lastIndexOf();
        lastIndexOf1();
        lastIndexOf2();
        lastIndexOf3();
        length();
        matches();
        regionMatches();
        regionMatches1();
        replace();
        replaceAll();
        replaceFirst();
        split();
        split1();
        startsWith();
        startsWith1();
        subSequence();
        substring();
        substring1();
        toCharArray();
        toLowerCase();
        toLowerCase1();
        toString1();
        toUpperCase();
        toUpperCase1();
        trim();
        valueOf();

    }

    private static void charAt(){
        System.out.println("charAt()");
        /**Description

         This method returns the character located at the String's specified index. The string indexes start from zero.
         Syntax

         Here is the syntax of this method −

         public char charAt(int index)

         Parameters

         Here is the detail of parameters −

         index − Index of the character to be returned.

         Return Value

         This method returns a char at the specified index.
         */
        String s = "Strings are immutable";
        char result = s.charAt(8);
        System.out.println(result);

        System.out.println("\n\n\n");
    }

    private static void compareTo(){
        System.out.println("compareTo()");
        /**Description

         This method compares this String to another Object.
         Syntax

         Here is the syntax of this method −

         int compareTo(Object o)

         Parameters

         Here is the detail of parameters −

         O − the Object to be compared.

         Return Value

         The value 0 if the argument is a string lexicographically equal to this string; a value less than 0 if the argument is a string lexicographically greater than this string; and a value greater than 0 if the argument is a string lexicographically less than this string.
         */
        String str1 = "Strings are immutable";
        String str2 = new String("Strings are immutable");
        String str3 = new String("Integers are not immutable");

        int result = str1.compareTo( str2 );
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);
        System.out.println("\n\n\n");
    }

    private static void compareToMethod(){
        System.out.println("compareTo String to another");
        /**Description

         This method compares two strings lexicographically.
         Syntax

         Here is the syntax of this method −

         int compareTo(String anotherString)

         Parameters

         Here is the detail of parameters −

         anotherString − the String to be compared.

         Return Value

         The value 0 if the argument is a string lexicographically equal to this string; a value less than 0 if the argument is a string lexicographically greater than this string; and a value greater than 0 if the argument is a string lexicographically less than this string.
         */
        String str1 = "Strings are immutable";
        String str2 = "Strings are immutable";
        String str3 = "Integers are not immutable";

        int result = str1.compareTo( str2 );
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);

        result = str3.compareTo( str1 );
        System.out.println(result);
        System.out.println("\n\n\n");
    }

    private static void compareToIgnoreCase(){
        System.out.println("compareToIgnoreCase");
        /**Description

         This method compares two strings lexicographically, ignoring case differences.
         Syntax

         Here is the syntax of this method −

         int compareToIgnoreCase(String str)

         Parameters

         Here is the detail of parameters −

         str − the String to be compared.

         Return Value

         This method returns a negative integer, zero, or a positive integer as the specified String is greater than, equal to, or less than this String, ignoring case considerations.
         */
        String str1 = "Strings are immutable";
        String str2 = "Strings are immutable";
        String str3 = "Integers are not immutable";

        int result = str1.compareToIgnoreCase( str2 );
        System.out.println(result);

        result = str2.compareToIgnoreCase( str3 );
        System.out.println(result);

        result = str3.compareToIgnoreCase( str1 );
        System.out.println(result);
        System.out.println("\n\n\n");
    }

    private static void concat(){
        System.out.println("concat");
        /**Description

         This method appends one String to the end of another. The method returns a String with the value of the String passed into the method, appended to the end of the String, used to invoke this method.
         Syntax

         Here is the syntax of this method −

         public String concat(String s)

         Parameters

         Here is the detail of parameters −

         s − the String that is concatenated to the end of this String.

         Return Value

         This methods returns a string that represents the concatenation of this object's characters followed by the string argument's characters.
         */
        String s = "Strings are immutable";
        s = s.concat(" all the time");
        System.out.println(s);
        System.out.println("\n\n\n");
    }

    private static void contentEquals(){
        System.out.println("contentEquals");
        /**Description

         This method returns true if and only if this String represents the same sequence of characters as specified in StringBuffer.
         Syntax

         Here is the syntax of this method −

         public boolean contentEquals(StringBuffer sb)

         Parameters

         Here is the detail of parameters −

         sb − the StringBuffer to compare.

         Return Value

         This method returns true if and only if this String represents the same sequence of characters as the specified in StringBuffer, otherwise false.
         */
        String str1 = "Not immutable";
        String str2 = "Strings are immutable";
        StringBuffer str3 = new StringBuffer( "Not immutable");

        boolean  result = str1.contentEquals( str3 );
        System.out.println(result);

        result = str2.contentEquals( str3 );
        System.out.println(result);
        System.out.println("\n\n\n");
    }

    private static void copyValueOf1(){
        System.out.println("copyValueOf");
        /**Description

         This returns a String that represents the character sequence in the array specified.
         Syntax

         Here is the syntax of this method −

         public static String copyValueOf(char[] data, int offset, int count)

         Parameters

         Here is the detail of parameters −

         data − the character array.

         offset − initial offset of the subarray.

         count − length of the subarray.

         Return Value

         This method returns a String that contains the characters of the character array.
         */
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String Str2 = "";
        Str2 = Str2.copyValueOf( Str1, 2, 6 );
        System.out.println("Returned String: " + Str2);
        System.out.println("\n\n\n");
    }

    private static void copyValueOf(){
        System.out.println("copyValueOf");
        /**Description

         This method returns a String that represents the character sequence in the array specified.
         Syntax

         Here is the syntax of this method −

         public static String copyValueOf(char[] data)

         Parameters

         Here is the detail of parameters −

         data − the character array.

         Return Value

         This method returns a String that contains the characters of the character array.
         */
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String Str2 = "";
        Str2 = Str2.copyValueOf( Str1 );
        System.out.println("Returned String: " + Str2);
        System.out.println("\n\n\n");
    }

    private static void endsWith(){
        System.out.println("endsWith");
        /**Description

         This method tests if this string ends with the specified suffix.
         Syntax

         Here is the syntax of this method −

         public boolean endsWith(String suffix)

         Parameters

         Here is the detail of parameters −

         suffix − the suffix.

         Return Value

         This method returns true if the character sequence represented by the argument is a suffix of the character sequence represented by this object; false otherwise. Note that the result will be true if the argument is the empty string or is equal to this String object as determined by the equals(Object) method.
         */
        String Str = new String("This is really not immutable!!");
        boolean retVal;

        retVal = Str.endsWith( "immutable!!" );
        System.out.println("Returned Value = " + retVal );

        retVal = Str.endsWith( "immu" );
        System.out.println("Returned Value = " + retVal );
        System.out.println("\n\n\n");
    }

    private static void equals(){
        System.out.println("equals");
        /**Description

         This method compares this string to the specified object. The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.
         Syntax

         Here is the syntax of this method −

         public boolean equals(Object anObject)

         Parameters

         Here is the detail of parameters −

         anObject − the object to compare this String against.

         Return Value

         This method returns true if the String are equal; false otherwise.
         */
        String Str1 = new String("This is really not immutable!!");
        String Str2 = Str1;
        String Str3 = new String("This is really not immutable!!");
        boolean retVal;

        retVal = Str1.equals( Str2 );
        System.out.println("Returned Value = " + retVal );

        retVal = Str1.equals( Str3 );
        System.out.println("Returned Value = " + retVal );
        System.out.println("\n\n\n");
    }

    private static void equalsIgnoreCase(){
        System.out.println("equalsIgnoreCase");
        /**Description

         This method compares this String to another String, ignoring case considerations. Two strings are considered equal ignoring case, if they are of the same length, and corresponding characters in the two strings are equal ignoring case.
         Syntax

         Here is the syntax of this method −

         public boolean equalsIgnoreCase(String anotherString)

         Parameters

         Here is the detail of parameters −

         anotherString − the String to compare this String against.

         Return Value

         This method returns true if the argument is not null and the Strings are equal, ignoring case; false otherwise.
         */
        String Str1 = new String("This is really not immutable!!");
        String Str2 = Str1;
        String Str3 = new String("This is really not immutable!!");
        String Str4 = new String("This IS REALLY NOT IMMUTABLE!!");
        boolean retVal;

        retVal = Str1.equals( Str2 );
        System.out.println("Returned Value = " + retVal );

        retVal = Str1.equals( Str3 );
        System.out.println("Returned Value = " + retVal );

        retVal = Str1.equalsIgnoreCase( Str4 );
        System.out.println("Returned Value = " + retVal );
        System.out.println("\n\n\n");
    }

    private static void getBytes(){
        System.out.println("getBytes");
        /**Description

         This method encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
         Syntax

         Here is the syntax of this method −

         public byte[] getBytes()

         Return Value

         This method returns the resultant byte array.
         */
        String Str1 = new String("Welcome to Learning Java");

        try {
            String Str2 = new String( Str1.getBytes( "UTF-8" ));
            System.out.println("Returned Value " + Str2 );
            Str2 = new String (Str1.getBytes( "ISO-8859-1" ));
            System.out.println("Returned Value " + Str2 );
        } catch ( UnsupportedEncodingException e) {
            System.out.println("Unsupported character set");
        }
        System.out.println("\n\n\n");
    }

    private static void getBytes1(){
        System.out.println("getBytes");
        /**Description

         This method encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array.
         Syntax

         Here is the syntax of this method −

         public byte[] getBytes(String charsetName) throws UnsupportedEncodingException

         Parameters

         Here is the detail of parameters −

         charsetName − the name of a supported charset.

         Return Value

         This method returns the resultant byte array.
         */
        String Str1 = new String("Welcome to Learning Java");
        try {
            String Str2 = new String(Str1.getBytes( "UTF-8" ));
            System.out.println("Returned Value " + Str2 );
            Str2 = new String (Str1.getBytes( "ISO-8859-1" ));
            System.out.println("Returned Value " + Str2 );
        } catch ( UnsupportedEncodingException e) {
            System.out.println("Unsupported character set");
        }
        System.out.println("\n\n\n");
    }

    private static void getChars(){
        System.out.println("getChars");
        /**Description

         This method copies characters from this string into the destination character array.
         Syntax

         Here is the syntax of this method −

         public void getChars(int srcBegin, int srcEnd, char[] dst,  int dstBegin)

         Parameters

         Here is the detail of parameters −

         srcBegin − index of the first character in the string to copy.

         srcEnd − index after the last character in the string to copy.

         dst − the destination array.

         dstBegin − the start offset in the destination array.

         Return Value

         It does not return any value but throws IndexOutOfBoundsException.
         */
        String Str1 = new String("Welcome to Learning Java");
        char[] Str2 = new char[7];
        try {
            Str1.getChars(2, 9, Str2, 0);
            System.out.print("Copied Value = " );
            System.out.println(Str2 );
        } catch ( Exception ex) {
            System.out.println("Raised exception...");
        }
        System.out.println("\n\n\n");
    }

    private static void hashCode1(){
        System.out.println("hashCode");
        /**Description

         This method returns a hash code for this string. The hash code for a String object is computed as −

         s[0]*31^(n - 1) + s[1]*31^(n - 2) + ... + s[n - 1]

         Using int arithmetic, where s[i] is the ith character of the string, n is the length of the string, and ^ indicates exponentiation. (The hash value of the empty string is zero.)
         Syntax

         Here is the syntax of this method −

         public int hashCode()

         Parameters

         Here is the detail of parameters −

         This is a default method and this will not accept any parameters.

         Return Value

         This method returns a hash code value for this object.
         */
        String Str = new String("Welcome to Learning Java");
        System.out.println("Hashcode for Str :" + Str.hashCode() );
        System.out.println("\n\n\n");
    }

    private static void indexOf(){
        System.out.println("indexOf");
        /**Description

         This method returns the index within this string of the first occurrence of the specified character or -1, if the character does not occur.
         Syntax

         Here is the syntax of this method −

         public int indexOf(char ch)

         Parameters

         Here is the detail of parameters −

         ch − a character.

         Return Value

         See the description.
         */
        String Str = new String("Welcome to Learning Java");
        System.out.print("Found Index :" );
        System.out.println(Str.indexOf( 'o' ));

        System.out.println("\n\n\n");
    }

    private static void indexOf1(){
        System.out.println("indexOf");
        /**Description

         This method returns the index within this string of the first occurrence of the specified character, starting the search at the specified index or -1, if the character does not occur.
         Syntax

         Here is the syntax of this method −

         public in indexOf(char ch, int fromIndex)

         Parameters

         Here is the detail of parameters −

         ch − a character.

         fromIndex − the index to start the search from.

         Return Value

         See the description.
         */
        String Str = new String("Welcome to Learning Java");
        System.out.print("Found Index :" );
        System.out.println(Str.indexOf( 'o', 5 ));
        System.out.println("\n\n\n");
    }

    private static void indexOf2(){
        System.out.println("indexOf");
        /**Description

         This method returns the index within this string of the first occurrence of the specified substring. If it does not occur as a substring, -1 is returned.
         Syntax

         Here is the syntax of this method −

         int indexOf(String str)

         Parameters

         Here is the detail of parameters −

         str − a string.

         Return Value

         See the description.
         */
        String Str = new String("Welcome to Learning Java");
        String SubStr1 = new String("Tutorials");
        System.out.println("Found Index :" + Str.indexOf( SubStr1 ));

        System.out.println("\n\n\n");
    }

    private static void indexOf3(){
        System.out.println("indexOf");
        /**Description

         This method returns the index within this string of the first occurrence of the specified substring, starting at the specified index. If it does not occur, -1 is returned.
         Syntax

         Here is the syntax of this method −

         int indexOf(String str, int fromIndex)

         Parameters

         Here is the detail of parameters −

         fromIndex − the index to start the search from.

         str − a string.

         Return Value

         See the description.
         */
        String Str = new String("Welcome to Learning Java");
        String SubStr1 = new String("Tutorials" );
        System.out.print("Found Index :" );
        System.out.println( Str.indexOf( SubStr1, 15 ));

        System.out.println("\n\n\n");
    }

    private static void intern(){
        System.out.println("intern");
        /**Description

         This method returns a canonical representation for the string object. It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.
         Syntax

         Here is the syntax of this method −

         public String intern()

         Parameters

         Here is the detail of parameters −

         This is a default method and this do not accept any parameters.

         Return Value

         This method returns a canonical representation for the string object.
         */
        String Str1 = new String("Welcome to Learning Java");
        String Str2 = new String("WELCOME TO SUTORIALSPOINT.COM");

        System.out.print("Canonical representation:" );
        System.out.println(Str1.intern());

        System.out.print("Canonical representation:" );
        System.out.println(Str2.intern());

        System.out.println("\n\n\n");
    }

    private static void lastIndexOf(){
        System.out.println("lastIndexOf");
        /**Description

         This method returns the index of the last occurrence of the character in the character sequence represented by this object that is less than or equal to fromIndex, or -1 if the character does not occur before that point.
         Syntax

         Here is the syntax of this method −

         int lastIndexOf(int ch)

         Parameters

         Here is the detail of parameters −

         ch − a character.

         Return Value

         This method returns the index.
         */
        String Str = new String("Welcome to Learning Java");
        System.out.print("Found Last Index :" );
        System.out.println(Str.lastIndexOf( 'o' ));

        System.out.println("\n\n\n");
    }

    private static void lastIndexOf1(){
        System.out.println("lastIndexOf");
        /**Description

         This method returns the index of the last occurrence of the character in the character sequence represented by this object that is less than or equal to fromIndex, or -1 if the character does not occur before that point.
         Syntax

         Here is the syntax of this method −

         public int lastIndexOf(int ch, int fromIndex)

         Parameters

         Here is the detail of parameters −

         ch − a character.

         fromIndex − the index to start the search from.

         Return Value

         This method returns the index.
         */
        String Str = new String("Welcome to Learning Java");
        System.out.print("Found Last Index :" );
        System.out.println(Str.lastIndexOf( 'o', 5 ));

        System.out.println("\n\n\n");
    }

    private static void lastIndexOf2(){
        System.out.println("lastIndexOf");
        /**Description

         This method accepts a String as an argument, if the string argument occurs one or more times as a substring within this object, then it returns the index of the first character of the last such substring is returned. If it does not occur as a substring, -1 is returned.
         Syntax

         Here is the syntax of this method −

         public int lastIndexOf(String str)

         Parameters

         Here is the detail of parameters −

         str − a string.

         Return Value

         This method returns the index.
         */
        String Str = new String("Welcome to Learning Java");
        String SubStr1 = new String("Tutorials" );
        System.out.print("Found Last Index :" );
        System.out.println( Str.lastIndexOf( SubStr1 ));

        System.out.println("\n\n\n");
    }

    private static void lastIndexOf3(){
        System.out.println("lastIndexOf");
        /**Description

         This method returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.
         Syntax

         Here is the syntax of this method −

         public int lastIndexOf(String str, int fromIndex)

         Parameters

         Here is the detail of parameters −

         fromIndex − the index to start the search from.

         str − a string.

         Return Value

         This method returns the index.
         */
        String Str = new String("Welcome to Learning Java");
        String SubStr1 = new String("Tutorials" );
        System.out.print("Found Last Index :" );
        System.out.println( Str.lastIndexOf( SubStr1, 15 ));

        System.out.println("\n\n\n");
    }

    private static void length(){
        System.out.println("length");
        /**Description

         This method returns the length of this string. The length is equal to the number of 16-bit Unicode characters in the string.
         Syntax

         Here is the syntax of this method −

         public int length()

         Parameters

         Here is the detail of parameters −

         NA

         Return Value

         This method returns the the length of the sequence of characters represented by this object.
         */
        String Str1 = new String("Welcome to Learning Java");
        String Str2 = new String("Tutorials" );

        System.out.print("String Length :" );
        System.out.println(Str1.length());

        System.out.print("String Length :" );
        System.out.println(Str2.length());

        System.out.println("\n\n\n");
    }

    private static void matches(){
        System.out.println("matches");
        /**Description

         This method tells whether or not this string matches the given regular expression. An invocation of this method of the form str.matches(regex) yields exactly the same result as the expression Pattern.matches(regex, str).
         Syntax

         Here is the syntax of this method −

         public boolean matches(String regex)

         Parameters

         Here is the detail of parameters −

         regex − the regular expression to which this string is to be matched.

         Return Value

         This method returns true if, and only if, this string matches the given regular expression.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :" );
        System.out.println(Str.matches("(.*)Tutorials(.*)"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Tutorials"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Welcome(.*)"));
        System.out.println("\n\n\n");
    }

    private static void regionMatches(){
        System.out.println("regionMatches");
        /**Description

         This method has two variants which can be used to test if two string regions are equal.
         Syntax

         Here is the syntax of this method −

         public boolean regionMatches(boolean ignoreCase,
         int toffset,
         String other,
         int ooffset,
         int len)

         Parameters

         Here is the detail of parameters −

         toffset − the starting offset of the subregion in this string.

         other − the string argument.

         ooffset − the starting offset of the subregion in the string argument.

         len − the number of characters to compare.

         ignoreCase − if true, ignore case when comparing characters.

         Return Value

         It returns true if the specified subregion of this string matches the specified subregion of the string argument; false otherwise. Whether the matching is exact or case insensitive depends on the ignoreCase argument.
         */
        String Str1 = new String("Welcome to Learning Java");
        String Str2 = new String("TUTORIALS");

        System.out.print("Return Value :" );
        System.out.println(Str1.regionMatches(true, 11, Str2, 0, 9));
        System.out.println("\n\n\n");
    }

    private static void regionMatches1(){
        System.out.println("regionMatches");
        /**Description

         This method has two variants which can be used to test if two string regions are equal.
         Syntax

         Here is the syntax of this method −

         public boolean regionMatches(int toffset,
         String other,
         int ooffset,
         int len)

         Parameters

         Here is the detail of parameters −

         toffset − the starting offset of the subregion in this string.

         other − the string argument.

         ooffset − the starting offset of the subregion in the string argument.

         len − the number of characters to compare.

         Return Value

         It returns true if the specified subregion of this string matches the specified subregion of the string argument; false otherwise. Whether the matching is exact or case insensitive depends on the ignoreCase argument.
         */
        String Str1 = new String("Welcome to Learning Java");
        String Str2 = new String("Tutorials");
        String Str3 = new String("TUTORIALS");

        System.out.print("Return Value :" );
        System.out.println(Str1.regionMatches(11, Str2, 0, 9));

        System.out.print("Return Value :" );
        System.out.println(Str1.regionMatches(11, Str3, 0, 9));
        System.out.println("\n\n\n");
    }

    private static void replace(){
        System.out.println("replace");
        /**Description

         This method returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
         Syntax

         Here is the syntax of this method −

         public String replace(char oldChar, char newChar)

         Parameters

         Here is the detail of parameters −

         oldChar − the old character.

         newChar − the new character.

         Return Value

         It returns a string derived from this string by replacing every occurrence of oldChar with newChar.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :" );
        System.out.println(Str.replace('o', 'T'));

        System.out.print("Return Value :" );
        System.out.println(Str.replace('l', 'D'));
        System.out.println("\n\n\n");
    }

    private static void replaceAll(){
        System.out.println("replaceAll");
        /**Description

         This method replaces each substring of this string that matches the given regular expression with the given replacement.
         Syntax

         Here is the syntax of this method −

         public String replaceAll(String regex, String replacement)

         Parameters

         Here is the detail of parameters −

         regex − the regular expression to which this string is to be matched.

         replacement − the string which would replace found expression.

         Return Value

         This method returns the resulting String.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :" );
        System.out.println(Str.replaceAll("(.*)Tutorials(.*)", "AMROOD"));
        System.out.println("\n\n\n");
    }

    private static void replaceFirst(){
        System.out.println("replaceFirst");
        /**Description

         This method replaces the first substring of this string that matches the given regular expression with the given replacement.
         Syntax

         Here is the syntax of this method −

         public String replaceFirst(String regex, String replacement)

         Parameters

         Here is the detail of parameters −

         regex − the regular expression to which this string is to be matched.

         replacement − the string which would replace found expression.

         Return Value

         This method returns a resulting String.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :" );
        System.out.println(Str.replaceFirst("(.*)Tutorials(.*)", "AMROOD"));

        System.out.print("Return Value :" );
        System.out.println(Str.replaceFirst("Tutorials", "AMROOD"));
        System.out.println("\n\n\n");
    }

    private static void split(){
        System.out.println("split");
        /**Description

         This method has two variants and splits this string around matches of the given regular expression.
         Syntax

         Here is the syntax of this method −

         public String[] split(String regex)

         Parameters

         Here is the detail of parameters −

         regex − the delimiting regular expression.

         Return Value

         It returns the array of strings computed by splitting this string around matches of the given regular expression.
         */
        String Str = new String("Welcome-to-Learning Java");
        System.out.println("Return Value :" );

        for (String retval: Str.split("-")) {
            System.out.println(retval);
        }
        System.out.println("\n\n\n");
    }

    private static void split1(){
        System.out.println("split");
        /**Description

         This method has two variants and splits this string around matches of the given regular expression.
         Syntax

         Here is the syntax of this method −

         public String[] split(String regex, int limit)

         Parameters

         Here is the detail of parameters −

         regex − the delimiting regular expression.

         limit − the result threshold, which means how many strings to be returned.

         Return Value

         It returns the array of strings computed by splitting this string around matches of the given regular expression.
         */
        String Str = new String("Welcome-to-Learning Java");
        System.out.println("Return Value :" );

        for (String retval: Str.split("-", 2)) {
            System.out.println(retval);
        }
        System.out.println("");
        System.out.println("Return Value :" );

        for (String retval: Str.split("-", 3)) {
            System.out.println(retval);
        }
        System.out.println("");
        System.out.println("Return Value :" );

        for (String retval: Str.split("-", 0)) {
            System.out.println(retval);
        }
        System.out.println("");

        System.out.println("\n\n\n");
    }

    private static void startsWith(){
        System.out.println("startsWith");
        /**Description

         This method has two variants and tests if a string starts with the specified prefix beginning a specified index or by default at the beginning.
         Syntax

         Here is the syntax of this method −

         public boolean startsWith(String prefix)

         Parameters

         Here is the detail of parameters −

         prefix − the prefix to be matched.

         Return Value

         It returns true if the character sequence represented by the argument is a prefix of the character sequence represented by this string; false otherwise.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :" );
        System.out.println(Str.startsWith("Welcome") );

        System.out.print("Return Value :" );
        System.out.println(Str.startsWith("Tutorials") );
        System.out.println("\n\n\n");
    }

    private static void startsWith1(){
        System.out.println("startsWith");
        /**Description

         This method has two variants and tests if a string starts with the specified prefix beginning a specified index or by default at the beginning.
         Syntax

         Here is the syntax of this method −

         public boolean startsWith(String prefix, int toffset)

         Parameters

         Here is the detail of parameters −

         prefix − the prefix to be matched.

         toffset − where to begin looking in the string.

         Return Value

         It returns true if the character sequence represented by the argument is a prefix of the character sequence represented by this string; false otherwise.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :" );
        System.out.println(Str.startsWith("Tutorials", 11) );
        System.out.println("\n\n\n");
    }

    private static void subSequence(){
        System.out.println("subSequence");
        /**Description

         This method returns a new character sequence that is a subsequence of this sequence.
         Syntax

         Here is the syntax of this method −

         public CharSequence subSequence(int beginIndex, int endIndex)

         Parameters

         Here is the detail of parameters −

         beginIndex − the begin index, inclusive.

         endIndex − the end index, exclusive.

         Return Value

         This method returns the specified subsequence.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :" );
        System.out.println(Str.subSequence(0, 10) );

        System.out.print("Return Value :" );
        System.out.println(Str.subSequence(10, 15) );
        System.out.println("\n\n\n");
    }

    private static void substring(){
        System.out.println("substring");
        /**Description

         This method has two variants and returns a new string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string or up to endIndex – 1, if the second argument is given.
         Syntax

         Here is the syntax of this method −

         public String substring(int beginIndex)

         Parameters

         Here is the detail of parameters −

         beginIndex − the begin index, inclusive.

         Return Value

         The specified substring.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :" );
        System.out.println(Str.substring(10) );

        System.out.println("\n\n\n");
    }

    private static void substring1(){
        System.out.println("substring");
        /**Description

         This method has two variants and returns a new string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string or up to endIndex – 1, if the second argument is given.
         Syntax

         Here is the syntax of this method −

         public String substring(int beginIndex, int endIndex)

         Parameters

         Here is the detail of parameters −

         beginIndex − the begin index, inclusive.

         endIndex − the end index, exclusive.

         Return Value

         The specified substring.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :" );
        System.out.println(Str.substring(10, 15) );
        System.out.println("\n\n\n");
    }

    private static void toCharArray(){
        System.out.println("toCharArray");
        /**Description

         This method converts this string to a new character array.
         Syntax

         Here is the syntax of this method −

         public char[] toCharArray()

         Parameters

         Here is the detail of parameters −

         NA

         Return Value

         It returns a newly allocated character array, whose length is the length of this string and whose contents are initialized to contain the character sequence represented by this string.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :" );
        System.out.println(Str.toCharArray() );

        System.out.println("\n\n\n");
    }

    private static void toLowerCase(){
        System.out.println("toLowerCase");
        /**Description

         This method has two variants. The first variant converts all of the characters in this String to lower case using the rules of the given Locale. This is equivalent to calling toLowerCase(Locale.getDefault()).

         The second variant takes locale as an argument to be used while converting into lower case.
         Syntax

         Here is the syntax of this method −

         public String toLowerCase()

         Parameters

         Here is the detail of parameters −

         NA

         Return Value

         It returns the String, converted to lowercase.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :");
        System.out.println(Str.toLowerCase());
        System.out.println("\n\n\n");
    }

    private static void toLowerCase1(){
        System.out.println("toLowerCase");
        /**Description

         This method has two variants. The first variant converts all of the characters in this String to lower case using the rules of the given Locale. This is equivalent to calling toLowerCase(Locale.getDefault()).

         The second variant takes locale as an argument to be used while converting into lower case.
         Syntax

         Here is the syntax of this method −

         public String toLowerCase(Locale locale)

         Parameters

         Here is the detail of parameters −

         NA

         Return Value

         It returns the String, converted to lowercase.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :");
        System.out.println(Str.toLowerCase());
        System.out.println("\n\n\n");
    }

    private static void toString1(){
        System.out.println("toString");
        /**Description

         This method returns itself a string.
         Syntax

         Here is the syntax of this method −

         public String toString()

         Parameters

         Here is the detail of parameters −

         NA

         Return Value

         This method returns the string itself.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :");
        System.out.println(Str.toString());
        System.out.println("\n\n\n");
    }

    private static void toUpperCase(){
        System.out.println("toUpperCase");
        /**Description

         This method has two variants. The first variant converts all of the characters in this String to upper case using the rules of the given Locale. This is equivalent to calling toUpperCase(Locale.getDefault()).

         The second variant takes locale as an argument to be used while converting into upper case.
         Syntax

         Here is the syntax of this method −

         public String toUpperCase()

         Parameters

         Here is the detail of parameters −

         NA

         Return Value

         It returns the String, converted to uppercase.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :" );
        System.out.println(Str.toUpperCase() );
        System.out.println("\n\n\n");
    }

    private static void toUpperCase1(){
        System.out.println("toUpperCase");
        /**Description

         This method has two variants. The first variant converts all of the characters in this String to upper case using the rules of the given Locale. This is equivalent to calling toUpperCase(Locale.getDefault()).

         The second variant takes locale as an argument to be used while converting into upper case.
         Syntax

         Here is the syntax of this method −

         public String toUpperCase(Locale locale)

         Parameters

         Here is the detail of parameters −

         NA

         Return Value

         It returns the String, converted to uppercase.
         */
        String Str = new String("Welcome to Learning Java");

        System.out.print("Return Value :" );
        System.out.println(Str.toUpperCase() );
        System.out.println("\n\n\n");
    }

    private static void trim(){
        System.out.println("trim");
        /**Description

         This method returns a copy of the string, with leading and trailing whitespace omitted.
         Syntax

         Here is the syntax of this method −

         public String trim()

         Parameters

         Here is the detail of parameters −

         NA

         Return Value

         It returns a copy of this string with leading and trailing white space removed, or this string if it has no leading or trailing white space.
         */
        String Str = new String("   Welcome to Learning Java   ");

        System.out.print("Return Value :" );
        System.out.println(Str.trim() );
        System.out.println("\n\n\n");
    }

    private static void valueOf(){
        System.out.println("valueOf");
        /**Description

         This method has the following variants, which depend on the passed parameters. This method returns the string representation of the passed argument.

         valueOf(boolean b) − Returns the string representation of the boolean argument.

         valueOf(char c) − Returns the string representation of the char argument.

         valueOf(char[] data) − Returns the string representation of the char array argument.

         valueOf(char[] data, int offset, int count) − Returns the string representation of a specific subarray of the char array argument.

         valueOf(double d) − Returns the string representation of the double argument.

         valueOf(float f) − Returns the string representation of the float argument.

         valueOf(int i) − Returns the string representation of the int argument.

         valueOf(long l) − Returns the string representation of the long argument.

         valueOf(Object obj) − Returns the string representation of the Object argument.

         Syntax

         Here is the syntax of this method −

         static String valueOf(boolean b)
         or
         static String valueOf(char c)
         or
         static String valueOf(char[] data)
         or
         static String valueOf(char[] data, int offset, int count)
         or
         static String valueOf(double d)
         or
         static String valueOf(float f)
         or
         static String valueOf(int i)
         or
         static String valueOf(long l)
         or
         static String valueOf(Object obj)

         Parameters

         Here is the detail of parameters −

         See the description.

         Return Value

         This method returns the string representation.
         */
        double d = 102939939.939;
        boolean b = true;
        long l = 1232874;
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };

        System.out.println("Return Value : " + String.valueOf(d) );
        System.out.println("Return Value : " + String.valueOf(b) );
        System.out.println("Return Value : " + String.valueOf(l) );
        System.out.println("Return Value : " + String.valueOf(arr) );
    }

}
