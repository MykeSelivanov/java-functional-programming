package consumerpractice;

import java.util.function.Consumer;

public class StringDoublePrinter implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s + " || " + s);
    }

}
