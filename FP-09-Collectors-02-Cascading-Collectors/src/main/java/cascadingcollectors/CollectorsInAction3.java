package cascadingcollectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction3 {
    public static void main(String[] args) {

        Path path = Paths.get("/Users/mykhailoselivanov/Documents/java-projects/java-functional-programming/FP-09-Collectors-02-Cascading-Collectors/src/main/java/cascadingcollectors/EmployeeData");
        try (Stream<String> lines = Files.lines(path)) {

            Spliterator<String> wordsSpliterator = lines.flatMap(line -> Arrays.stream(line.split(",")))
                                                    .spliterator();

            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordsSpliterator);

            List<Employee> employeesList = StreamSupport.stream(employeeSpliterator, false)
                                            .collect(Collectors.toList());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
