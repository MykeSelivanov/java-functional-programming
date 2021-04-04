package parallelstreams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        /**
         * Main idea of using parallel streams is to improve the performance
         *
         * There are 2 ways of processing with streams:
         * Sequential - <collection>.stream() - streams are always sequential by default
         * Parallel - to create a parallel Stream:
         *                                          - <collection>.parallelStream() method or
         *                                          - <stream>.parallel() - invoke a parallel() method on a regular sequential stream
         */

        List<Employee> employeeList = new ArrayList<>();

        // each iterations = 6 new Employees, after 100 iterations we will have 600 employees in the list
        for (int i = 0; i < 10000000; i++){
            employeeList.add(new Employee("John", 20000));
            employeeList.add(new Employee("Ben", 30000));
            employeeList.add(new Employee("Patrick", 40000));
            employeeList.add(new Employee("Sara", 50000));
            employeeList.add(new Employee("Gabi", 60000));
            employeeList.add(new Employee("Angela", 70000));
        }

        // execute sequentially and measure time needed for this operation
        long startTime = System.currentTimeMillis();
        System.out.println("Sequential stream: " + employeeList.stream()
                .filter(employee -> employee.getSalary() > 30000)
                .count());
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println( "Sequential Duration: " + duration);

        // execute parallel stream and measure time take to execute
        startTime = System.currentTimeMillis();
        System.out.println("Parallel stream: " + employeeList.parallelStream()
                .filter(employee -> employee.getSalary() > 30000)
                .count());
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println( "Parallel Duration: " + duration);



    }

}
