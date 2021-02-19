package purefunctions;

public class PureFunction {
    public static void main(String[] args) {

    }

    // No side effects
    // function does not modify any state outside the function anywhere
    public static int sum(int a, int b){
        return a + b;
    }

    public static int multiply(int a, int b){
        log(String.format("Returning %s as the result of %s * %s", a * b, a, b));
        return a * b;
    }

    public static void log(String message){
        System.out.println(message);
    }

}
