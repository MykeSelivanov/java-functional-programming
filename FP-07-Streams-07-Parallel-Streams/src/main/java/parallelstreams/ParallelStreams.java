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
         *
         * Keep in mind, that going parallel is expensive, parallelism comes with some implications like outcome after
         * the processing should be same as sequential processing
         *
         * While applying parallel operations on some data, you need to keep in mind that the stream should be:
         * - stateless (check the java doc for each intermediate stream operation you're using, it should say is is stateless or stateful method)
         * - non-interfering (data-source should not get affected during the stream operations)
         * - associative (one operation result should not get affected by the order of data under processing)
         *
         * Also keep in mind, that parallel execution has more complexity than the sequential execution, so
         * in reality sometimes parallelism will speed up the computation, sometimes it will not, and sometimes it
         * will even slow it down
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

        /**
         * Result of the above example will depend on the amount of data that is processed in stream
         * when you have your loop that creates data - i < 10000000, starting from this point parallel stream will
         * outperform sequential one (keep in mind it depends on your machine hardware)
         * I cases below 10000000 sequential stream outperforms parallel (again, this is the case for my machine)
         */



    }

}
