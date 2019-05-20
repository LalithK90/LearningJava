package LoopPackage;

public class Loop {
    public static void main(String[] args) {
        whileLoop();
        forLoop();
        doWhileLoop();
        breakStatement();
        continueStatement();
        enhancedForLoop();
        ifElseStatement();
        ifStatement();
        nestedIfStatement();
        switchStatement();
    }
    private static void whileLoop(){
        System.out.println("While Loop");
        /**The syntax of a while loop is −

         while(Boolean_expression) {
         // Statements
         }

         Here, statement(s) may be a single statement or a block of statements. The condition may be any expression, and true is any non zero value.

         When executing, if the boolean_expression result is true, then the actions inside the loop will be executed. This will continue as long as the expression result is true.

         When the condition becomes false, program control passes to the line immediately following the loop.

         Here, key point of the while loop is that the loop might not ever run. When the expression is tested and the result is false, the loop body will be skipped and the first statement after the while loop will be executed.
          */
        int x = 10;

        while( x < 20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }
        System.out.println("\n\n\n");
    }

    private static void forLoop() {
        System.out.println("For Loop");
        /**A for loop is a repetition control structure that allows you to efficiently write a loop that needs to be executed a specific number of times.

         A for loop is useful when you know how many times a task is to be repeated.
         Syntax

         The syntax of a for loop is −

             for(initialization; Boolean_expression; update) {
             // Statements
             }

         Here is the flow of control in a for loop −

         The initialization step is executed first, and only once. This step allows you to declare and initialize any loop control variables and this step ends with a semi colon (;).

         Next, the Boolean expression is evaluated. If it is true, the body of the loop is executed. If it is false, the body of the loop will not be executed and control jumps to the next statement past the for loop.

         After the body of the for loop gets executed, the control jumps back up to the update statement. This statement allows you to update any loop control variables. This statement can be left blank with a semicolon at the end.

         The Boolean expression is now evaluated again. If it is true, the loop executes and the process repeats (body of loop, then update step, then Boolean expression). After the Boolean expression is false, the for loop terminates.
         */

        for(int x = 10; x < 20; x = x + 1) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
        System.out.println("\n\n\n");
    }

    private static void doWhileLoop() {
        System.out.println("Do While Loop");
        /**A do...while loop is similar to a while loop, except that a do...while loop is guaranteed to execute at least one time.
         Syntax

         Following is the syntax of a do...while loop −

         do {
         // Statements
         }while(Boolean_expression);

         Notice that the Boolean expression appears at the end of the loop, so the statements in the loop execute once before the Boolean is tested.

         If the Boolean expression is true, the control jumps back up to do statement, and the statements in the loop execute again. This process repeats until the Boolean expression is false.
        * */
        int x = 10;

        do {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }while( x < 20 );

        System.out.println("\n\n\n");
    }

    private static void breakStatement() {
        System.out.println("Break Statement");
        /**
         * The break statement in Java programming language has the following two usages −
         *
         *     When the break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.
         *
         *     It can be used to terminate a case in the switch statement (covered in the next chapter).
         *
         * Syntax
         *
         * The syntax of a break is a single statement inside any loop −
         *
         * break;
         * */
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
        System.out.println("\n\n\n");
    }

    private static void continueStatement() {
        System.out.println("Continue Statement");
        /**The continue keyword can be used in any of the loop control structures. It causes the loop to immediately jump to the next iteration of the loop.

         In a for loop, the continue keyword causes control to immediately jump to the update statement.

         In a while loop or do/while loop, control immediately jumps to the Boolean expression.

         Syntax

         The syntax of a continue is a single statement inside any loop −

         continue;

         */
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }
        System.out.println("\n\n\n");
    }

    private static void enhancedForLoop() {
        System.out.println("Enhanced For Loop");
        /**Syntax

         Following is the syntax of enhanced for loop −

             for(declaration : expression) {
             // Statements
             }

         Declaration − The newly declared block variable, is of a type compatible with the elements of the array you are accessing. The variable will be available within the for block and its value would be the same as the current array element.

         Expression − This evaluates to the array you need to loop through. The expression can be an array variable or method call that returns an array.
         */

        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"James", "Larry", "Tom", "Lacy"};

        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
        System.out.println("\n\n\n");
    }

    private static void ifStatement(){
        System.out.println("If Statement");
        /**An if statement consists of a Boolean expression followed by one or more statements.
         Syntax

         Following is the syntax of an if statement −

         if(Boolean_expression) {
         // Statements will execute if the Boolean expression is true
         }

         If the Boolean expression evaluates to true then the block of code inside the if statement will be executed.
         If not, the first set of code after the end of the if statement (after the closing curly brace) will be executed.*/

        int x = 10;

        if( x < 20 ) {
            System.out.print("This is if statement");
        }
        System.out.println("\n\n\n");
    }

    private static void ifElseStatement(){
        System.out.println("IF ELSE Statement");
        /**An if statement can be followed by an optional else statement, which executes when the Boolean expression is false.
         Syntax

         Following is the syntax of an if...else statement −

         if(Boolean_expression) {
         // Executes when the Boolean expression is true
         }else {
         // Executes when the Boolean expression is false
         }

         If the boolean expression evaluates to true, then the if block of code will be executed, otherwise else block of code will be executed.*/
        int x = 30;

        if( x < 20 ) {
            System.out.print("This is if statement");
        }else {
            System.out.print("This is else statement");
        }


        System.out.println("\n\n\n if...else if...else Statement");
        /**The if...else if...else Statement

         An if statement can be followed by an optional else if...else statement, which is very useful to test various conditions using single if...else if statement.

         When using if, else if, else statements there are a few points to keep in mind.

         An if can have zero or one else's and it must come after any else if's.

         An if can have zero to many else if's and they must come before the else.

         Once an else if succeeds, none of the remaining else if's or else's will be tested.

         Syntax

         Following is the syntax of an if...else statement −

         if(Boolean_expression 1) {
         // Executes when the Boolean expression 1 is true
         }else if(Boolean_expression 2) {
         // Executes when the Boolean expression 2 is true
         }else if(Boolean_expression 3) {
         // Executes when the Boolean expression 3 is true
         }else {
         // Executes when the none of the above condition is true.
         }
         */
        int y = 30;

        if( y == 10 ) {
            System.out.print("Value of X is 10");
        }else if( y == 20 ) {
            System.out.print("Value of X is 20");
        }else if( y == 30 ) {
            System.out.print("Value of X is 30");
        }else {
            System.out.print("This is else statement");
        }
        System.out.println("\n\n\n");
    }

    private static void nestedIfStatement(){
        System.out.println("Nested If Statement");
        /**It is always legal to nest if-else statements which means you can use one if or else if statement inside another if or else if statement.
         Syntax

         The syntax for a nested if...else is as follows −

             if(Boolean_expression 1) {
             // Executes when the Boolean expression 1 is true
             if(Boolean_expression 2) {
             // Executes when the Boolean expression 2 is true
                 }
             }

         You can nest else if...else in the similar way as we have nested if statement.
         */
        int x = 30;
        int y = 10;

        if( x == 30 ) {
            if( y == 10 ) {
                System.out.print("X = 30 and Y = 10");
            }
        }
        System.out.println("\n\n\n");
    }

    private static void switchStatement(){
        System.out.println("Switch Statement");
        /**A switch statement allows a variable to be tested for equality against a list of values. Each value is called a case, and the variable being switched on is checked for each case.
         Syntax

         The syntax of enhanced for loop is −

             switch(expression) {
             case value :
             // Statements
             break; // optional

             case value :
             // Statements
             break; // optional

             // You can have any number of case statements.
             default : // Optional
             // Statements
             }

         The following rules apply to a switch statement −

         The variable used in a switch statement can only be integers, convertable integers (byte, short, char), strings and enums.

         You can have any number of case statements within a switch. Each case is followed by the value to be compared to and a colon.

         The value for a case must be the same data type as the variable in the switch and it must be a constant or a literal.

         When the variable being switched on is equal to a case, the statements following that case will execute until a break statement is reached.

         When a break statement is reached, the switch terminates, and the flow of control jumps to the next line following the switch statement.

         Not every case needs to contain a break. If no break appears, the flow of control will fall through to subsequent cases until a break is reached.

         A switch statement can have an optional default case, which must appear at the end of the switch. The default case can be used for performing a task when none of the cases is true. No break is needed in the default case.
         */

        // char grade = args[0].charAt(0);
        char grade = 'C';

        switch(grade) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
        System.out.println("\n\n\n");
    }


}
