package ifpresentstreamorequalshashcode;

import java.util.Optional;

public class IfPresentStreamOrEqualsHashcode {
    public static void main(String[] args) {

        // ifPresent
        Optional<String> optional = Optional.of("Value");
        optional.ifPresent(System.out :: println);
        optional.ifPresent(val -> System.out.println("This is a " + val));

    }

}
