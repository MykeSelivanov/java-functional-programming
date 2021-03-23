import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipeline {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        List<Book> collect = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter(book -> book.getRating() > 3)
                .collect(Collectors.toList());

        // 1.
        Stream<Book> stream = books.stream();

        // 2.
        Stream<Book> horrorBooks = stream.filter(book -> book.getGenre().equalsIgnoreCase("Horror"));

        // 3.
        Stream<Book> popularHorrorBooks = horrorBooks.filter(book -> book.getRating() > 3);

        // 4.
        List<Book> collect1 = popularHorrorBooks.collect(Collectors.toList());


    }
}
