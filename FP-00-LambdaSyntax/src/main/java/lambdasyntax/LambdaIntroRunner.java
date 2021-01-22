package lambdasyntax;

public class LambdaIntroRunner {
    public static void main(String[] args) {

        Measurable measurable1 = () -> System.out.println("measuring square");
        Measurable measurable2 = () -> System.out.println("measuring rectangle");

        Measurable measurable3 = () -> {
            System.out.println("measuring circle - step 1");
            System.out.println("measuring circle - step 2");
            System.out.println("measuring circle - step 3");};

        measurable1.measure();
        measurable2.measure();
        measurable3.measure();

        Computable adder = (num1, num2) -> System.out.println("adding result " + (num1 + num2));
        Computable multiplier = (num1, num2) -> System.out.println("multiplying result " + (num1 * num2));
        Computable divider = (num1, num2) -> System.out.println("division result " + (num1 / num2));

        adder.compute(5,7);

    }
}
