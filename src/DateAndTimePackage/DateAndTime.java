package DateAndTimePackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String[] args) {
        currentDateAndTime();
        simpleDateFormat();
        printf();
        printf1();
        printf2();
        dateToString();
        whileDate();
        elapsedTime();
        gregorianCalendar();

    }

    private static void currentDateAndTime(){
        System.out.println("Current date and time");
        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        System.out.println(date.toString());
        System.out.println("\n\n\n");
    }

    private static void simpleDateFormat(){
        System.out.println("Simple Date Format");
        Date dNow = new Date( );
        SimpleDateFormat ft =
                new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + ft.format(dNow));

        System.out.println("\n\n\n");
    }

    private static void printf(){
        System.out.println("printf");
        // Instantiate a Date object
        Date date = new Date();

        // display time and date
        String str = String.format("Current Date/Time : %tc", date );

        System.out.printf(str);

        System.out.println("\n\n\n");
    }

    private static void printf1(){
        System.out.println(" printf");
        // Instantiate a Date object
        Date date = new Date();

        // display time and date
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
        System.out.println("\n\n\n");
    }

    private static void printf2(){
        System.out.println("printf");
        // Instantiate a Date object
        Date date = new Date();

        // display formatted date
        System.out.printf("%s %tB %<te, %<tY", "Due date:", date);

        System.out.println("\n\n\n");
    }

    private static void dateToString(){
        System.out.println("Date to String");
        String args[] = {"1","2","3","4"};
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];

        System.out.print(input + " Parses as ");
        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
        System.out.println("\n\n\n");
    }

    private static void whileDate(){
        System.out.println("While");
        try {
            System.out.println(new Date( ) + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        System.out.println("\n\n\n");
    }

    private static void elapsedTime(){
        System.out.println("Elapsed time");
        try {
            long start = System.currentTimeMillis( );
            System.out.println(new Date( ) + "\n");

            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");

            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        System.out.println("\n\n\n");
    }

    private static void gregorianCalendar(){
        System.out.println("Gregorian Calender");
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
                "Oct", "Nov", "Dec"};

        int year;
        // Create a Gregorian calendar initialized
        // with the current date and time in the
        // default locale and timezone.

        GregorianCalendar gcalendar = new GregorianCalendar();

        // Display current time and date information.
        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        // Test if the current year is a leap year
        if(gcalendar.isLeapYear(year)) {
            System.out.println("The current year is a leap year");
        }else {
            System.out.println("The current year is not a leap year");
        }
    }
}
