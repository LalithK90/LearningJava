package Lambda;


interface Process {
    void process(int i);
}


public class LambdaExampleThisKeyWordDemo {
    public static void main(String[] args) {
        LambdaExampleThisKeyWordDemo lambdaExampleThisKeyWordDemo = new LambdaExampleThisKeyWordDemo();
        /* step -> 1
        lambdaExampleThisKeyWordDemo.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("value of i  is "+i);
                System.out.println(this);
            }
            public String toString(){
                return "This is the anonymous inner class";
            }
        });*/
/*        lambdaExampleThisKeyWordDemo.doProcess(10, i->{
                System.out.println("value of i  is " + i);
               // System.out.println(this); This will not work

        });*/
        lambdaExampleThisKeyWordDemo.execute();
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("value of i  is " + i);
            System.out.println(this); //This will not work

        });
    }

    private void doProcess(int i, Process p) {
        p.process(i);
    }

public String toString(){
return "This is the main lambdaExampleThisKeyWordDemo class instance";
}
}