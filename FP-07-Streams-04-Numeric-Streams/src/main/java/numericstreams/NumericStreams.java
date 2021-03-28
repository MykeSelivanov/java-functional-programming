package numericstreams;

import java.util.ArrayList;
import java.util.List;

public class NumericStreams {
    public static void main(String[] args) {

        /**
         * IntStream, LongStream, DoubleStream - primitive streams in java 8
         *
         *
         */

        List<Book> books = new ArrayList<>();
        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.5));
        books.add(new Book("The Notebook", "Nicholas Sparks ", "Romance", 4.10));
        books.add(new Book("It", "Stephen King", "Horror", 4.74));
        books.add(new Book("Clean Code", "Robert Martin", "Science", 4.99));
        books.add(new Book("Data Structures and Algo", "Michael Goodrich", "Horror", 4.17));

    }

}
