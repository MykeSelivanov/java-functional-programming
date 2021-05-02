package treesetmappartitionbygroupbyjoining;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction2 {
    public static void main(String[] args) {

        Path path = Paths.get("/Users/mykhailoselivanov/Documents/java-projects/java-functional-programming/FP-09-Collectors-01-Terminal-Analogous-Collectors-02-TreeSet-Map-PartitionBy-GroupBy-Joining/src/main/java/treeSetMapPartitionByGroupBy/EmployeeData");
        try (Stream<String> lines = Files.lines(path)) {
            // 1. reading document with employee data line by line
            // 2. splitting lines on "," to get words
            // 3. creating custom employee spliterator
            // 4. getting stream of employees from employee data file
            // 5. storing employees from stream into employee list, to invoke new streams on employee list later on
            Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split(",")));
            Spliterator<String> wordsSpliterator = words.spliterator();
            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordsSpliterator);
            Stream<Employee> employees = StreamSupport.stream(employeeSpliterator, false);
            List<Employee> employeesList = employees.collect(Collectors.toList());

            System.out.println("---------------Collection(TreeSet)---------------");
            // let's say you want to have all employees in a structure, where employees are sorted based on their employee ID
            // Collectors.toCollection takes a collection supplier in order to build desired collection with collectionFactory
            // when you use a treeSet to store employees sorted, you also need to provide employee comparator in Employee class
            TreeSet<Employee> employeesSortedOnID = employeesList.stream()
                    .collect(Collectors.toCollection(() -> new TreeSet<>()));
            System.out.println(employeesSortedOnID);

            System.out.println("---------------Collection(Map)---------------");
            // store the employee data from stream to a map, with employee ID as a key and employee name as a respective value
            Map<Integer, String> getEmployeeNameByID = employeesList.stream()
                    .collect(
                            // instead of toMap you can also use toUnmodifiableMap if you want to create immutable Map with values
                            Collectors.toMap(employee -> employee.getId(), employee -> employee.getName()) // first - keyMapper, second argument - valueMapper
                    );
            System.out.println(getEmployeeNameByID);

            System.out.println("---------------Collectors.partitioningBy(predicate)---------------");
            // collect all employees, gender == M
            // Map will contain 2 entries, first for which Boolean == false with the list of employee.getGender() == 'F'
            // and the other one with Boolean == true, which contains the list with all the employee.getGender() == 'M'
            Map<Boolean, List<Employee>> entriesWithMaleAndFemaleEmployees = employeesList.stream()
                    .collect(
                            Collectors.partitioningBy(employee -> employee.getGender() == 'M')
                    );
            System.out.println(entriesWithMaleAndFemaleEmployees);
            // List of male employees
            List<Employee> maleEmployee = entriesWithMaleAndFemaleEmployees.get(true);
            // List of female employee
            List<Employee> femaleEmployee = entriesWithMaleAndFemaleEmployees.get(false);

            System.out.println("---------------Collectors.groupingBy(function)---------------");
            Map<String, List<Employee>> getByDesignation = employeesList.stream()
                    .collect(Collectors.groupingBy(employee -> employee.getDesignation()));
            System.out.println(getByDesignation);

            System.out.println("---------------Collectors.joining(delimiter)---------------");
            // You can store all the data into single string separated by a provided delimiter
            String employeeNamesStr = employeesList.stream()
                    .map(employee -> employee.getName())
                    .collect(Collectors.joining(", "));
            System.out.println(employeeNamesStr);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
