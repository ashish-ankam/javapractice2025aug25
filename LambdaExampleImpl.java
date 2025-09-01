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
public void call(){
    lambdaExample.display("Hello from call method!");
    System.out.println("Sum: " + lambdaExample2.calculate(3, 4));
    System.out.println("Area: " + lambdaExample3.calculateArea(5));
}


public static void main(String[] args) {
    LambdaExampleImpl example = new LambdaExampleImpl();
    example.call();
}
}
