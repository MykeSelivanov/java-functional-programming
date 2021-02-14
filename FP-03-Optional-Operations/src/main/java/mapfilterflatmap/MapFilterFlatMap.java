package mapfilterflatmap;

import java.util.Optional;

public class MapFilterFlatMap {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Value");
        Optional<String> emptyOptional = Optional.empty();

        // map() - modifies the value of optional
        String map = optional.map(val -> "String").orElse("Empty");
        System.out.println(map);

        Optional<String> mapOnEmpty = emptyOptional.map(val -> "New value");
//        System.out.println(mapOnEmpty.get()); // will throw no such element exception
        String mapOnEmpty1 = mapOnEmpty.map(val -> "Proper way").orElse("Optional was empty, here is Default value");
        System.out.println(mapOnEmpty1);

        // filter() - checks the condition for optional with a predicate
        // if condition is satisfied, the same optional again will be returned
        Optional<String> filter = optional.filter(val -> val.equalsIgnoreCase("Value"));
        System.out.println(filter.get());

        // if condition is not satisfied, empty optional will be returned
        Optional<String> filter1 = optional.filter(val -> val.equalsIgnoreCase("NOT VALUE"));
        System.out.println(filter1.orElse("Default"));

        // flatMap() - returns an optional
        Optional<String> flatMap = optional.flatMap(val -> Optional.of("Replaced"));
        System.out.println(flatMap.get());

    }
}
