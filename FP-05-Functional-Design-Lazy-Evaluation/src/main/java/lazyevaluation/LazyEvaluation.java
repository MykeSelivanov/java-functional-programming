package lazyevaluation;

import java.util.function.Supplier;

public class LazyEvaluation {
    public static void main(String[] args) {

        /**
         * Lazy evaluation is an evaluation strategy which delays the evaluation of an expression until the value is needed
         * You can take advantage of this behavior to delay or to even avoid method invocation or evaluation of an expression
         * simply because some values might never be needed, or some expression might never need to be evaluated
         *
         * Lambdas are core concept of lazy evaluation
         * Whenever you write lambda expression it's not getting executed just on the line where it's written, it will
         * be executed only when you invoke them
         */
        Supplier<Integer> supplier = () -> 123;

        // Example
        if (true) {  //condition is satisfied)
            // only if the condition is satisfied, lambda will be invoked and evaluated
            supplier.get();
        } else {
            // otherwise lambda in supplier won't get evaluated
        }

        /**
         * Lazy initialization
         */
        // Laziness also can help in delaying the creation of heavyweight objects
        Supplier<Person> personSupplier = () -> new Person("Peter", 37);

        // we can create the instances just at the time we need them
        Person p1 = personSupplier.get();

    }

    static class Person{
        String name;
        Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

}


