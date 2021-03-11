package tailcalloptimization;

public class TailCallOptimization {
    public static void main(String[] args) {

        /**
         * Tail Call Optimization or Tail Call Recursion
         * In case of regular recursion it keeps holding on to the stack because there are further operations to be performed
         * Large input will significantly impact performance
         *
         * Whereas in case of tail recursion there is an accumulator to store calculations product in it, which is not
         * holding on to the stack
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
