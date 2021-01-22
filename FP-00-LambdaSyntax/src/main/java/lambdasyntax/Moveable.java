package lambdasyntax;

@FunctionalInterface
public interface Moveable {
    void move(int mile);
}

@FunctionalInterface
interface Measurable{
    void measure();
}

@FunctionalInterface
interface Computable{
    void compute(int num1, int num2);
}

@FunctionalInterface
interface Flyable{
    boolean flyHigh(int mile);
}
