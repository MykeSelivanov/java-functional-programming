package purefunctions;

public class PureFunction {
    public static void main(String[] args) {

        //int result = add(multiply(2,3) , multiply(3,4));
        // substitution model says that you can replace any function call with it's return value
        int result = add(6, 12);
        System.out.println(result);

    }

    // No side effects
    // function does not modify any state outside the function anywhere
    public static int add(int a, int b){
        return a + b;
    }

    // Not a pure function
    public static int multiply(int a, int b){
        log(String.format("Returning %s as the result of %s * %s", a * b, a, b));
        return a * b;
    }

    // Not a pure function - does not return anything, and logging is considered as side effect
    public static void log(String message){
        System.out.println(message);
    }

}
