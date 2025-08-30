public class LambdaExampleImpl implements ILambdaExample {

ILambdaExample lambdaExample = (message) -> System.out.println(message);

public static void main(String[] args) {
    lambdaExample.display("Hello, Lambda Expressions!");
}

}
