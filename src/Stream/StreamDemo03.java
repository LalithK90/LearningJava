package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo03 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
                //values.forEach(i->doubleInt(i));
                            //  method belong class :: method name
                values.forEach(StreamDemo03::doubleInt);
    }
    public static void doubleInt(int i){
        System.out.println(i*2);
    }
}
