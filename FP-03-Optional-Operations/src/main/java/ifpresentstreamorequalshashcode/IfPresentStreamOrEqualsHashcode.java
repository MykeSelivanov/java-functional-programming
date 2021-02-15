package ifpresentstreamorequalshashcode;

import java.util.Optional;

public class IfPresentStreamOrEqualsHashcode {
    public static void main(String[] args) {

        // ifPresent
        Optional<String> optional = Optional.of("Value");
        optional.ifPresent(System.out :: println);
        optional.ifPresent(val -> System.out.println("This is a " + val));
        System.out.println("============================================");

        // ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)
        // If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
        Optional.empty().ifPresentOrElse(System.out :: println, () -> System.out.println("Value is absent"));
        System.out.println("============================================");


        // stream()
        // If a value is present, returns a sequential Stream containing only that value,
        // otherwise returns an empty Stream
        optional.stream().forEach(System.out :: println);
        Optional.empty().stream().forEach(System.out :: println); // stream is empty and it doesn't print anything to console
        System.out.println("============================================");


        // or()
        // If a value is present, returns an Optional describing the value,
        // otherwise returns an Optional produced by the supplying function.
        optional.or(() -> Optional.of("New Value")).ifPresent(System.out::println);
        Optional.empty().or(() -> Optional.of("New Value")).ifPresent(System.out::println);
        System.out.println("============================================");

        // equals()
        // the other object is considered equal if it is also an optional, both comparisons are empty or
        // both contain equal value( values in optionals equal to each other via equals method)
        System.out.println(optional.equals(Optional.of("Value")));
        System.out.println(optional.equals(Optional.empty()));
        System.out.println("============================================");


        // hashcode()
        // returns hashcode of the value
        System.out.println(optional.hashCode());
        System.out.println(Optional.empty().hashCode());


    }

}
