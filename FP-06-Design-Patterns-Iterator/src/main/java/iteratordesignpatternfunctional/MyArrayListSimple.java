package iteratordesignpatternfunctional;

import java.util.function.Consumer;

public class MyArrayListSimple {

    Object [] elements = new Object[5];

    public MyArrayListSimple(Object[] elements) {
        this.elements = elements;
    }

    public void forEach(Consumer<Object> action) {
        for (int i = 0; i < elements.length; i++){
            action.accept(elements[i]);
        }
    }

}
