package composition;

public interface Function<T, R> {

    R apply(T t);

    // this method returns a function that can compose 2 functions
    default <V> Function<V,R> compose(Function<V,T> before) {
        return (V v) -> apply(before.apply(v));
    }

}
