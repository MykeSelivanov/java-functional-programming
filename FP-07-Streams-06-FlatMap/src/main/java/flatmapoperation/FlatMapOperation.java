package flatmapoperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapOperation {
    public static void main(String[] args) {

        Stream<String> a = Stream.of("One","Two");
        Stream<String> b = Stream.of("Three", "Four");

        // stream of streams
        Stream<Stream<String>> streamOfStreams = Stream.of(a, a);

        // but what if you just want all the elements from stream a and b, without creating a stream of streams?
        // in order to achieve that, we'll have to flatten the individual streams with flatMap() method
        // which takes a mapper (identity function)
        // identity function is a function that takes an element, and returns the same element
        Stream<String> flatMap = Stream.of(a, b)
                .flatMap(stringStream -> stringStream);

        // store the "text.txt" file path in Path variable from the java.nio.file library
        Path p = Paths.get("/Users/mykhailoselivanov/Documents/java-projects/java-functional-programming/FP-07-Streams-06-FlatMap/src/main/java/flatmapoperation/text.txt");

        // now we have lines as a Stream elements
        try (Stream<String> textLines = Files.lines(p);) {
            // now we will collect all the words from each line, splitting them on a "/s"
            List<String> textWords = textLines
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .collect(Collectors.toList());

            textWords.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
