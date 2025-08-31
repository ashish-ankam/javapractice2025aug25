public class LambdaExampleImpl implements ILambdaExample ,ILambdaExample2, ILambdaExample3 {

ILambdaExample lambdaExample = (message) -> System.out.println(message);

ILambdaExample2 lambdaExample2 = (a, b) -> {
    return a + b;
};

ILambdaExample3 lambdaExample3 = new ILambdaExample3() {
    @Override
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
};



public static void main(String[] args) {
    lambdaExample.display("Hello, Lambda Expressions!");
    int result = lambdaExample2.calculate(5, 10);
    System.out.println("Result: " + result);

    double area = lambdaExample3.calculateArea(7);
    System.out.println("Area: " + area);
}

}
