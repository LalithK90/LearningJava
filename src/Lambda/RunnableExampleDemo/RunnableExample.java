package Lambda.RunnableExampleDemo;

public class RunnableExample {
    public static void main(String[] args) {
                                        //Anonymous inner class
        Thread newThread =new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Print inside runable");
            }
        });
        newThread.run();

        Thread lambdaThread = new Thread(()-> System.out.println("print inline lambda"));
                lambdaThread.run();
    }


}
