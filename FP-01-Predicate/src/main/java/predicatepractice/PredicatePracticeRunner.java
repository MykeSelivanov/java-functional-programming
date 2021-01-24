package predicatepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePracticeRunner {
    public static void main(String[] args) {

        Predicate<String> moreThan5Char = new MoreThan5CharChecker();

        List<String> names = Arrays.asList("Jameson","Joseph","Pete","Mike","Hanna","Diana");

        names.removeIf(moreThan5Char);
        System.out.println(names);


    }

}
