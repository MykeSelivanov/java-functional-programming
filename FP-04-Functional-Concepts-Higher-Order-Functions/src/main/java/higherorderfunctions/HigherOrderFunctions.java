package higherorderfunctions;

public class HigherOrderFunctions {
    public static void main(String[] args) {

        /**
         * Higher order functions are functions which either:
         * take functions as arguments
         * or return functions as output
         * or does both
         */




    }

    public static <T,R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T,R> configurator){
        return () -> {
            T product = producer.produce();
            return configurator.configure(product);
        };
    }


}
