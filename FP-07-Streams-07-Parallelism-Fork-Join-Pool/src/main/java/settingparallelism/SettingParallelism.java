package settingparallelism;

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
        ForkJoinPool pool = new ForkJoinPool(2); // parameter limits the number of threads used by this instance of ForkJoinPool



    }
}
