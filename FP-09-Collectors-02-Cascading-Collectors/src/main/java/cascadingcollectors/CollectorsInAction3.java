package cascadingcollectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
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

            // grouping by employees by their designation and then counting how many employees you have for each designation
            Map<String, Long> countByDesignation = employeesList.stream()
                    .collect(
                            Collectors.groupingBy(
                                    employee -> employee.getDesignation(),
                                    Collectors.counting()));
            System.out.println(countByDesignation);

            // find the total salary fund that is distributed for each designation
            // grouping by to a list of employees for particular designation and then calculate the sum of salaries of employee in each group
            Map<String, Double> fundDistribution = employeesList.stream()
                    .collect(Collectors.groupingBy(
                            employee -> employee.getDesignation(),
                            Collectors.summingDouble(employee -> employee.getSalary())
                        )
                    );
            System.out.println(fundDistribution);

            // getting an employee with the highest salary in each group
            Map<String, Optional<Employee>> maxSalaryEmployees = employeesList.stream()
                    .collect(Collectors.groupingBy(
                            employee -> employee.getDesignation(),
                            Collectors.maxBy(Comparator.comparing(employee -> employee.getSalary()))
                            )
                    );
            System.out.println(fundDistribution);




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
