package DateTime;

public class CurrentTimeAndCalculationDemo {
    //System.current time milli second
    public static void main(String[] args) {
/*        long startTime = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= 10000; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);*/

        long time = System.currentTimeMillis(); //in milli second from 01/01/1970 to today
        System.out.println("Now time is " + time);

    }
}
