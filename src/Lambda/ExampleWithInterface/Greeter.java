package Lambda.ExampleWithInterface;

public class Greeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        ExampleGreeting exampleGreeting = new ExampleGreeting();
        greeter.greet(exampleGreeting);

//other way to get
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("lambda Example ehehhe");
            }
        };



        //FunctionType<void,void> exampleLambdaFunction = ()-> System.out.println("lambda Example");
        ExampleLambda exampleLambdaFunction = ()-> System.out.println("lambda Example 2");
        ExampelAdd   addFunction = (int a, int b)->a+b;
        ExampelAdd   addOtherFunction = Integer::sum;

        Greeting otherExampleLambdaFunction = ()-> System.out.println("lambda Example 1");

        otherExampleLambdaFunction.perform();
    }

    private void greet(Greeting greeting) {
        greeting.perform();
    }

}
//lambda used interface should be one method otherwise lambda can not identify  whiat would use
interface ExampleLambda{
    void example();
}
interface ExampelAdd{
    int add(int x, int y );
}