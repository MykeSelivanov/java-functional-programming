package referencialtransparency;

public class ReferentialTransparency {
    public static void main(String[] args) {

        /** Referential transparency means that a function call can be replaced b it's value
         * or another referentially transparent call with the same result
         * Functional style avoids such methods that are not referentially transparent
         * And the reason functional programming use referential transparency is that
         * it makes reasoning about programs easier, it also makes each subprogram independent
         * which greatly simplifies unit testing and refactoring
         */

        int result = add(2, multiply(2,4));
        // multiply(2,4) is referentially transparent method
        // you can substitute multiply(2,4) with 8 or
        // you can substitute multiply(2,4) with multiply(2, multiply(2,2))
        System.out.println(result);

    }

    public static int add(int a, int b){
        return a + b;
    }
    // add(a,b) is also referentially transparent
    // it is a pure function and all pure functions are referentially transparent
    // however not all referentially transparent functions are pure functions

    public static int multiply(int a, int b){

        return a * b;
    }

}
