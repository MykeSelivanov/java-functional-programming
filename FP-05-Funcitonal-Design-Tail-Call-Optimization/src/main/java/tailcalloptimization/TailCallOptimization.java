package tailcalloptimization;

public class TailCallOptimization {
    public static void main(String[] args) {

        /**
         * Tail Call Optimization or Tail Call Recursion
         * In case of regular recursion it keeps holding on to the stack because there are further operations to be performed
         * Large input will significantly impact performance
         * Compilers cannot convert regular recursive calls into iterations
         *
         * Whereas in case of tail recursion there is an accumulator to store calculations product in it, which is not
         * holding on to the stack for the operations, and that is why compiler can convert tail recursion into pure iterations
         * This approach is called tail call optimization in compiler - it is preferable wherever possible to replace regular recursion
         *
         * Unfortunately java compiler does not support tail call optimization - it can't convert recursive calls into iterations
         * Since recursion is used in functional programming a lot, it's a good approach to be careful when nesting them
         * to avoid stack overflow
         *
         */
    }

    // regular recursion
    public static long recursiveFactorial(int n){
        if (n <= 1) return 1;
        return n * recursiveFactorial(n - 1);
    }

    // Tail recursion
    // n - is the number, whose factorial we need to calculate and a - is accumulator to accumulate the calculation product
    public static long tailReFact(int n, int a){
        if (n <= 1) return a;
        return tailReFact(n-1, n * a);
    }

}
