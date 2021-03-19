package factoryfunctionalway;

import java.util.function.Supplier;

public class FlooringFactory {

    // takes minimum and maximum temperature of the area where flooring will be installed
    public static Flooring getFlooring(int minTemp, int maxTemp){

        Supplier<Flooring> flooringSupplier;

        if (minTemp <= 5 && maxTemp <= 20) {
            flooringSupplier = () -> new WoodenFlooring();
        } else if (minTemp <= 5 && maxTemp >= 45) {
            flooringSupplier = () -> new CorkFlooring();
        } else {
            flooringSupplier = () -> new ConcreteFlooring();
        }

        return flooringSupplier.get();

    }

}
