package ShortHandOperationANDMissilenous;

public class PrintAsciiValue {
    public static void main(String[] args) {
        //ASCII = American Standard Code for Information Interchange

        // 7 bits
        // 2 ^ 7 = 128
        // 0 - 127

        for (int i = 0; i <= 127; i++) {
//%d = Ascii value
//%c = Ascii value according to  symbol
            System.out.printf("%d : %c \n", i, i);
        }

    }
}
