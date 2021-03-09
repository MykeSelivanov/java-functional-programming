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

        int value = 123;

        Task lambda = () -> {
            System.out.println();
        };

    }

}
