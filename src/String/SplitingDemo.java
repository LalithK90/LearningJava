package String;

public class SplitingDemo {
    public static void main(String[] args) {
        String string = " Lalith, Asanka, Nuwan, Kasun, Sumane";
        String names[] = string.split(",");
        System.out.println(string);
        for (String val : names){
            System.out.println(val);
        }
    }
}
