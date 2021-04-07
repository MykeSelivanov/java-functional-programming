package settingparallelism;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class SettingParallelism {
    public static void main(String[] args) {

        /**
         * Commonly used Fork-Join Pool is used by all parallel stream operations
         * and takes all available processors by default
         */

        // to get the number of available processors
        System.out.println(Runtime.getRuntime().availableProcessors());

        // by setting this property you can control the number of cores that processor will use for ForkJoinPool
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","2");

        // will print the number of cores, that will be used by ForkJoinPool, this means there will be 2 threads in this ForkJoinPool
        // By default ForkJoinPool is using (n - 1) threads available in the system, because one thread is always required
        // for the main method, therefore, if your system has 16 cores, ForkJoinPool will use 15
        System.out.println(ForkJoinPool.getCommonPoolParallelism());

        // If you don't want to use common ForkJoinPool, you can create your own
        // parameter limits the number of threads used by this instance of ForkJoinPool
        // you can also have the number of threads greater than number of processors, but keep in mind that can cost some performance overhead
        ForkJoinPool pool = new ForkJoinPool(2);

        /**
         * How to decide on the number of threads needed?
         *
         * For Computational intensive jobs or CPU bound (a lot of calculations or logic to perform) - Number of threads <= number of processor cores
         *
         * For I/O intensive jobs or I/O bound jobs (file operation, database operation, http call) - Number of threads can be > number of cores
         * If the application is I/O intensive, then application is sleeping half of the time, so to leverage the CPU, you can create more threads
         * Creating more threads at a time usually helps, but after some point they start causing performance degradation
         */

        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++){
            employeeList.add(new Employee("John", 20000));
            employeeList.add(new Employee("Ben", 30000));
            employeeList.add(new Employee("Patrick", 40000));
            employeeList.add(new Employee("Sara", 50000));
            employeeList.add(new Employee("Gabi", 60000));
            employeeList.add(new Employee("Angela", 70000));
        }

        Long count = 0L;
        try {
            count = pool.submit(() ->
                    employeeList.parallelStream()
                            .filter(employee -> employee.getSalary() > 30000)
                            .count()).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(count);

    }
}
