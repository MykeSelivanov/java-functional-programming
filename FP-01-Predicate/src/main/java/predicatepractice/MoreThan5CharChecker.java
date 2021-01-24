package predicatepractice;

import java.util.function.Predicate;

public class MoreThan5CharChecker implements Predicate<String> {

    // Predicate - boolean-valued function of one argument
    public boolean test(String s) {
        return s.length() > 5;
    }
}
