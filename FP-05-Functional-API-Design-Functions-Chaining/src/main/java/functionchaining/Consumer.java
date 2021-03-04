package functionchaining;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);

    // since functional interfaces can have only one abstract method, andThen should be 'default' with implementation provided
    default Consumer<T> andThen(Consumer<T> next){
      return   (T t) -> {
            // invokes accept() on itself
            this.accept(t);
            // and then invokes accept() on the consumer passed to it
            next.accept(t);
        };
    }
}
