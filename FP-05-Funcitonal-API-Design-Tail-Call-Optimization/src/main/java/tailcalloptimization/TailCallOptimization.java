package tailcalloptimization;

public class TailCallOptimization {
    public static void main(String[] args) {

        /**
         * Tail Call Optimization or Tail Call Recursion
         */

    }

    public static long recursiveFactorial(int n){
        if (n <= 1) return 1;
        return n * recursiveFactorial(n - 1);
    }

}
