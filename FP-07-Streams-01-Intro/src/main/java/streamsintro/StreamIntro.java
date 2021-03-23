package streamsintro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntro {
    public static void main(String[] args) {

        /**
         * Streams are Declarative, Flexible and Parallelizable
         *
         * How Stream works:
         * 1. The Stream takes the data from a source
         * 2. Do all the processing
         * 3. Return the data into the container the user wants or just consumes the data
         *
         * Stream is a sequence of elements from a source that supports data processing operations
         * You're not restricted to have collection as a source, it can be a file, array, input/output resources,
         * string, any object
         *
         */

        // Before java 8
        List<Book> books = new ArrayList<>();
        List<Book> popularHorrorBooks = new ArrayList<>();

        for (Book book: books) {
            if (book.getGenre().equalsIgnoreCase("Horror") && book.getRating() > 3) {
                popularHorrorBooks.add(book);
            }
        }

        // In SQL same operation will look like "SELECT name FROM books WHERE genre='horror' AND rating >3"

        // java 8 streams
        List<Book> collect = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter(book -> book.getRating() > 3)   // streams are flexible, you can add extra condition with another predicate
                .collect(Collectors.toList());

        // parallelization in Streams helps to improve performance for large collections of elements
        // and writing parallel code with streams is relatively easy
        // you can add stream().parallel() or you can use parallelStream()
        List<Book> collect2 = books.parallelStream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter(book -> book.getRating() > 3)   // streams are flexible, you can add extra condition with another predicate
                .collect(Collectors.toList());


    }
}
