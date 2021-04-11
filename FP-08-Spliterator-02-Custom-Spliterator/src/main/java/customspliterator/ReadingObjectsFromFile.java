package customspliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;

public class ReadingObjectsFromFile {
    public static void main(String[] args) {

        // creating spliterator to read a books from the Book file as a Book objeccts
        Path path = Paths.get("/Users/mykhailoselivanov/Documents/java-projects/java-functional-programming/FP-08-Spliterator-02-Custom-Spliterator/src/main/java/customspliterator/Books");

        try {
            Stream<String> lines = Files.lines(path);

            Spliterator<String> baseSpliterator = lines.spliterator();
            Spliterator<Book> bookSpliterator = new BookSpliterator(baseSpliterator);


        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
