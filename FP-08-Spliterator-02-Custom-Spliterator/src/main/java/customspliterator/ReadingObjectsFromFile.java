package customspliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingObjectsFromFile {
    public static void main(String[] args) {

        Path path = Paths.get("/Users/mykhailoselivanov/Documents/java-projects/java-functional-programming/FP-08-Spliterator-02-Custom-Spliterator/src/main/java/customspliterator/Books");

        try {
            Stream<String> lines = Files.lines(path);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
