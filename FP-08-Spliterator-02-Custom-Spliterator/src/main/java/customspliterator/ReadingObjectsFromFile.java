package customspliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadingObjectsFromFile {
    public static void main(String[] args) {

        // creating spliterator to read a books from the Book file as a Book objeccts
        Path path = Paths.get("/Users/mykhailoselivanov/Documents/java-projects/java-functional-programming/FP-08-Spliterator-02-Custom-Spliterator/src/main/java/customspliterator/Books");

        try {
            Stream<String> lines = Files.lines(path);

            Spliterator<String> baseSpliterator = lines.spliterator();
            Spliterator<Book> bookSpliterator = new BookSpliterator(baseSpliterator);

            // StreamSupport.stream(spliterator, parallel(true/false)) - method to create a stream based on spliterator and parallel true/false flag
            Stream<Book> books = StreamSupport.stream(bookSpliterator, false);
            books.forEach(System.out::println);



        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
