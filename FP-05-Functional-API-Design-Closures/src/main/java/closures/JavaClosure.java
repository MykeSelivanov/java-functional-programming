package closures;

public class JavaClosure {
    public static void main(String[] args) {

        /**
         * A closure is a function that refers to free variables in its lexical context
         * function - block of code, it may produce a result
         * free variable - is an identifier used, but not defined by the closure
         * lexical context - convention that sets the scope of a variable so that it may only be called within the block
         * of code in which it is defined
         *                                                            Neil Gafter (pioneered introducing closures in java)
         */
        // Closures are important because they control what is and what is not in scope of particular function
        // along with which variables are shared between sibling functions in the same containing scope

        int value = 123;

        // this lambda is a closure that uses a free variable present in it's lexical scope - value
        Task lambda = () -> {
            // JRE is keeping track of value here
            System.out.println(value);
            System.out.println("Task Completed");
        };

        // when we pass lambda here, the variable value is also passed
        printValue(lambda);

    }

    private static void printValue(Task lambda){
        // where we calling lambda, the value variable is not present in this scope
        lambda.doTask();
    }

}
