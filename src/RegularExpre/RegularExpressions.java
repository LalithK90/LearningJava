package RegularExpre;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        RegexMatches();
        startAndEndMethods();
        matchesAndLookingAtMethods();
        replaceFirstAndReplaceAllMethods();
        appendReplacementAndAppendTailMethods();

    }

    private static void RegexMatches(){
        System.out.println("Regex Matcher");
        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        }else {
            System.out.println("NO MATCH");
        }
        System.out.println("\n\n\n");
    }

    private static void startAndEndMethods(){
        System.out.println("start and end Methods");

         String REGEX = "\\bcat\\b";
         String INPUT = "cat cat cat cattie cat";

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);   // get a matcher object
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }

        System.out.println("\n\n\n");
    }

    private static void matchesAndLookingAtMethods(){
        System.out.println("matches and lookingAt Methods");

        String REGEX = "foo";
        String INPUT = "fooooooooooooooooo";

         Pattern pattern;
         Matcher matcher;

        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("Current REGEX is: "+REGEX);
        System.out.println("Current INPUT is: "+INPUT);

        System.out.println("lookingAt(): "+matcher.lookingAt());
        System.out.println("matches(): "+matcher.matches());

        System.out.println("\n\n\n");
    }

    private static void replaceFirstAndReplaceAllMethods(){
        System.out.println("replaceFirst and replaceAll Methods");

        String REGEX = "dog";
        String INPUT = "The dog says meow. " + "All dogs say meow.";
        String REPLACE = "cat";

        Pattern p = Pattern.compile(REGEX);

        // get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);

        System.out.println("\n\n\n");
    }

    private static void appendReplacementAndAppendTailMethods(){
        System.out.println("appendReplacement and appendTail Methods");
        String REGEX = "a*b";
        String INPUT = "aabfooaabfooabfoob";
        String REPLACE = "-";

        Pattern p = Pattern.compile(REGEX);

        // get a matcher object
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()) {
            m.appendReplacement(sb, REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());

        System.out.println("\n\n\n");
    }


}
