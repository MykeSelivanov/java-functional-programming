package numericstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreams {
    public static void main(String[] args) {

        /**
         * IntStream, LongStream, DoubleStream - primitive streams in java 8
         *
         * map() vs mapToDouble()
         * map : stream of Objects, if the result is primitive it will box it to Object (for eg Integer, Double, Long)
         * mapToDouble : unbox the Object to primitive
         *
         * IntStream marToInt(toIntFunction mapper) : Integer -> int
         * LongStream marToInt(toLongFunction mapper) : Long -> long
         * DoubleStream marToInt(toDoubleFunction mapper) : Double -> double
         *
         * One of the biggest benefits of using primitive streams is that they allow to avoid the cost of boxing and unboxing
         * which means better performance
         *
         */

        List<Book> books = new ArrayList<>();
        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.5));
        books.add(new Book("The Notebook", "Nicholas Sparks ", "Romance", 4.10));
        books.add(new Book("It", "Stephen King", "Horror", 4.74));
        books.add(new Book("Clean Code", "Robert Martin", "Science", 4.99));
        books.add(new Book("Data Structures and Algo", "Michael Goodrich", "Horror", 4.17));

        // Let's calculate average rating of the books in list
        OptionalDouble averageRating = books.stream()
                .mapToDouble(book -> book.getRating()) // will take the rating and will return the stream of primitive doubles
                .average(); // returns an optional

        System.out.println(averageRating.getAsDouble());

        // of() method for stream creation in primitive streams
        IntStream intS = IntStream.of(1,2,3,4,5);
        DoubleStream doubleS = DoubleStream.of(1.501, 2.367, 3.475, 4.599);
        LongStream longS = LongStream.of(1L ,2L, 3L, 4L, 5L);

        // boxed method is boxing stream primitives to objects
        Stream<Integer> boxedInts = intS.boxed(); // returns the object version of stream with Integers

        // matToObj() also maps the primitives in streams to objects, you need to provide a mapper function
        Stream<Double> boxedDoubles = doubleS.mapToObj(value -> value); // first value is primitive, second one is mapped to an object (Double in this case)


    }

}
