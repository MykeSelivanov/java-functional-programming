import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipeline {
    public static void main(String[] args) {

        /**
         * Stream pipeline consists of a:
         * 1. Source - collection, an array, a generator function or an i/o channel
         * 2. Zero or more Intermediate Operations - operations that are applied on a stream and they return another stream
         * 3. Terminal operation - produce a result or side effect from the stream
         * (side effect is anything other than returning a result, for eg print statement)
         */

        List<Book> books = new ArrayList<>();

        // Stream pipeline
        List<Book> collect = books.stream() // Source
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror")) // Intermediate operation
                .filter(book -> book.getRating() > 3) // Intermediate operation
                .collect(Collectors.toList()); // Terminal operation

        // 1. Source
        Stream<Book> stream = books.stream();

        // 2. Intermediate operation
        Stream<Book> horrorBooks = stream.filter(book -> book.getGenre().equalsIgnoreCase("Horror"));

        // 3. Intermediate operation
        Stream<Book> popularHorrorBooks = horrorBooks.filter(book -> book.getRating() > 3);

        // 4. Terminal operation
        List<Book> collect1 = popularHorrorBooks.collect(Collectors.toList());


    }
}
