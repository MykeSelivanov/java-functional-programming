package mapfilterflatmap;

import java.util.Optional;

public class MapFilterFlatMap {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Value");
        Optional<String> emptyOptional = Optional.empty();

        // map()
        Optional<String> map = optional.map(val -> "Replaced");
        System.out.println(map.get());

        Optional<String> mapOnEmpty = emptyOptional.map(val -> "New value");
//        System.out.println(mapOnEmpty.get()); // will throw no such element exception
        String mapOnEmpty1 = mapOnEmpty.map(val -> "Proper way").orElse("Value From Map");
        System.out.println(mapOnEmpty1);


    }
}
