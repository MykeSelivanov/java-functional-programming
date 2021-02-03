package comparatorwithfunction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithFunctionRunner {
    public static void main(String[] args) {

        Comparator<String> byCharComparison =
                // old school way
                // ((o1, o2) -> o1.substring(o1.length()-1).compareTo(o2.substring(o2.length()-1)));

                // shorter syntax with Function
                Comparator.comparing(str -> str.substring(str.length()-1));

        List<String> names = Arrays.asList("John","Peter","Hannah","Gregory","Amanda","Nadia");

        names.sort(byCharComparison);

        int i = 1;
        for (String name: names) {
            System.out.println("sorted at " + i + ": " + name);
            i++;
        }

    }


}
