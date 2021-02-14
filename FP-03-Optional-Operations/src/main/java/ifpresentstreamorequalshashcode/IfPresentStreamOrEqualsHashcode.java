package ifpresentstreamorequalshashcode;

import java.util.Optional;

public class IfPresentStreamOrEqualsHashcode {
    public static void main(String[] args) {

        // ifPresent
        Optional<String> optional = Optional.of("Value");
        optional.ifPresent(System.out :: println);
        optional.ifPresent(val -> System.out.println("This is a " + val));

        // ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)
        // If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
        Optional.empty().ifPresentOrElse(System.out :: println, () -> System.out.println("Value is absent"));

        // stream()
        // If a value is present, returns a sequential Stream containing only that value,
        // otherwise returns an empty Stream
        optional.stream().forEach(System.out :: println);
        Optional.empty().stream().forEach(System.out :: println); // stream is empty and it doesn't print anything to console

        // or()

    }

}
