package parametersnoreturntype;

public class ParametersNoReturnType {
    public static void main(String[] args) {

        // Parameters in ()

        MathOperation add = (a, b) -> System.out.println(a + b);
        add.operation(10,20);

        MathOperation multiply = (a, b) -> System.out.println(a * b);
        multiply.operation(10, 70);

    }

}
