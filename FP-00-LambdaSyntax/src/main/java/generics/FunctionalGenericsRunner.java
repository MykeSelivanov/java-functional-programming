package generics;

public class FunctionalGenericsRunner {
    public static void main(String[] args) {

        FunctionalGenerics<String,String> functionalGenerics = str -> str.substring(1,5);
        System.out.println(functionalGenerics.execute("Hello Worlds"));

        FunctionalGenerics<String, Integer> functionalGenerics1 = str -> str.length();
        System.out.println(functionalGenerics1.execute("Hi World"));

    }
}
