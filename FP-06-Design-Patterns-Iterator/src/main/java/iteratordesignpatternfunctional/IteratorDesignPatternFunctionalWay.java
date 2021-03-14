package iteratordesignpatternfunctional;

public class IteratorDesignPatternFunctionalWay {
    public static void main(String[] args) {

        /**
         * Iterator pattern is about accessing elements without exposing internal structure
         *
         * The iterator design pattern enables to get a way to access the elements of a collection object in sequential
         * manner without any need to know its internal representation
         * Examples:
         * java.util.Iterator
         * java.util.Enumeration
         *
         */

        //starting from java8 there is a functional forEach method, that iterates over collections

        MyArrayListSimple myArrayListSimple = new MyArrayListSimple(new Object[] {1,2,3,4,5});

        // functional implementation of iterator with our custom forEach method
        // will print all the object elements of list
        myArrayListSimple.forEach(System.out::println);


    }

}
