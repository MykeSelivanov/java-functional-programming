package streamslaziness;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsLaziness {
    public static void main(String[] args) {

        /**
         * All the intermediate operations on Streams are lazy
         * Stream pipeline gets triggered, only when a terminal operation is applied
         * Terminal operation on a stream is eager - it will execute the complete pipeline right at the time, when it is applied
         *
         * Intermediate operations - lazy
         * Terminal operations - eager
         */

        List<Book> books = new ArrayList<>();
        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.5));
        books.add(new Book("The Notebook", "Nicholas Sparks ", "Romance", 4.10));
        books.add(new Book("It", "Stephen King", "Horror", 4.74));
        books.add(new Book("Clean Code", "Robert Martin", "Science", 4.99));
        books.add(new Book("Data Structures and Algo", "Michael Goodrich", "Horror", 4.17));

        // Streams are lazy, until you add the terminal operation, that's why in the code snippet below
        // Filtering is done is print first
        // then peek()
        // then Collection is done and
        // then each element of the list
        Stream<Book> stream = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .peek(book -> System.out.println("Filtered book " + book))
                .filter(book -> book.getRating() > 3);

        System.out.println("Filtering is done");

        collect(stream);

    }

    private static void collect(Stream<Book> stream){
        List<Book> popularHorrorBooks = stream.collect(Collectors.toList());
        System.out.println("Collection is done");
        popularHorrorBooks.forEach(System.out::println);
    }
}
