public class LambdaExampleImpl implements ILambdaExample ,ILambdaExample2{

ILambdaExample lambdaExample = (message) -> System.out.println(message);

ILambdaExample2 lambdaExample2 = (a, b) -> {
    return a + b;
};

public static void main(String[] args) {
    lambdaExample.display("Hello, Lambda Expressions!");
    int result = lambdaExample2.calculate(5, 10);
    System.out.println("Result: " + result);
}

}
