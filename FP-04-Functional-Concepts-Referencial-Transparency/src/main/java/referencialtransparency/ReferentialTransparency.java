package referencialtransparency;

public class ReferentialTransparency {
    public static void main(String[] args) {

        /** Referential transparency means that a function call can be replaced bu it's value
         * or another referentially transparent call with the same result
         */

        int result = add(2, multiply(2,4));
        System.out.println(result);


    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

}
