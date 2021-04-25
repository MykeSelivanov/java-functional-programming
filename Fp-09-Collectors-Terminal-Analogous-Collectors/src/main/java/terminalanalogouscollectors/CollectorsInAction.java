package terminalanalogouscollectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction {
    public static void main(String[] args) {

        Path path = Paths.get("/Users/mykhailoselivanov/Documents/java-projects/java-functional-programming/Fp-09-Collectors-Terminal-Analogous-Collectors/src/main/java/terminalanalogouscollectors/EmployeeData");

        try (Stream<String> lines = Files.lines(path)) {

            // getting flatten stream on all the words present in the file
            Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split(",")));

            // creating a base spliterator
            Spliterator<String> wordsSpliterator = words.spliterator();

            // creating a custom spliterator, that will read Employee objects based on base words spliterator
            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordsSpliterator);

            // Creating stream from StreamSupport class and passing custom spliterator created above
            Stream<Employee> employees = StreamSupport.stream(employeeSpliterator, false);
//            employees.forEach(System.out::println);

            // Since employees stream will be consumed after couple operations, it's a good idea to store the data from this stream
            // in a List, which you can easily then convert to stream to process the data
            List<Employee> employeesList = employees.collect(Collectors.toList());

            // Getting list of all the employee names into an immutable(unmodifiable List)
            List<String> employeeNames = employeesList.stream()
                    .map(employee -> employee.getName())
                    .collect(Collectors.toUnmodifiableList());

            // Collect all the employee designations from the data file, and make sure you're not collecting duplicates,
            // since multiple employee can have same designation, thus - use Set
            Set<String> employeeDesignation = employeesList.stream()
                    .map(employee -> employee.getDesignation())
                    .collect(Collectors.toUnmodifiableSet());

            // after collecting employee names and designations, we can print them, to make sure correct data was collected
            System.out.println(employeeNames);
            System.out.println(employeeDesignation);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
