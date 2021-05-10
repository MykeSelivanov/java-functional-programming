package cascadingcollectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
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
            System.out.println(maxSalaryEmployees);

            /**
             * Below snippet currently not working in Intellij due to some IDE issues
             */
            // getting max salary in each group without comparing the employee objects
            // in order to achieve this, we will need to transform the list of employees to the list of salaries (doubles)
            // for that mapping collector can be used as a downstream collector,
//            Map<String, Optional<Double>> maxSalaries = employeesList.stream()
//                    .collect(
//                            Collectors.groupingBy(
//                            employee -> employee.getDesignation(),
//                            // mapping can also have a downstream collector, which can be provided as a second argument
//                            Collectors.mapping(
//                                    employee -> employee.getSalary(),
//                                    // collector maxBy is taking comparator to compare salaries to identify the biggest one
//                                    // but since comparison will be on the actual salary value, lambda will look like salary -> salary
//                                    // and when lambda takes the return value the same as an input value, you can write this as Function.identity()
//                                    Collectors.maxBy(Comparator.comparing(Function.identity())))
//                            )
//                    );
//            System.out.println(maxSalaries);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
