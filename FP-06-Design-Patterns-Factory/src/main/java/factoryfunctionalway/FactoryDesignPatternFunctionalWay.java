package factoryfunctionalway;

public class FactoryDesignPatternFunctionalWay {
    public static void main(String[] args) {
        /**
         * Factory is a Creational pattern
         * Factory pattern is about creating object without exposing instantiation logic, so client knows nothing
         * about it, even the type of the object is not known
         *
         * Ex:
         * Calendar cal = Calendar.getInstance(); -> returns Calendar instance
         * System.out.println(cal); -> java.util.GregorianCalendar - GregorianCalendar is the actual concrete implementation
         * that is being called underneath this factory instance
         *
         * The factory design pattern is a way to instantiating a class inside a designated method that we call a
         * factory method.
         * Factory is an object that is able to create other objects
         *
         */

        // we don't know which object we're going to get and which implementation of the flooring will be provided
        // It is decided by the factory according to the input parameters
        Flooring floor = FlooringFactory.getFlooring(-1, 18);
        floor.installation();

    }
}
