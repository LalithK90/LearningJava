import java.util.Date;

public class sampleTest {
    public static void main(String[] args) {
        System.out.println(new Date()+"\n");

        int i = 770_000_000;
        int j = 779_999_999;
        while (i < j){
            System.out.print(i+1 +" ");
            i = i+1;
        }
        System.out.println("\n"+ new Date());
    }
}
