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
        // will print the number of cores, that will be used by ForkJoinPool
        System.out.println(ForkJoinPool.getCommonPoolParallelism());

    }
}
