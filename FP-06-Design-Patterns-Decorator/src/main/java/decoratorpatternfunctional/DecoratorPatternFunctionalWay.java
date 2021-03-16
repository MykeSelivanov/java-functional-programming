package decoratorpatternfunctional;

public class DecoratorPatternFunctionalWay {
    public static void main(String[] args) {

        /**
         * The Decorator design pattern is used to modify functionality of object at runtime without affecting other
         * instances of the same class
         *
         * Basically this pattern provides functionality wrappers and we keep on wrapping the object into these wrappers
         * one after another according to the additional decorations or the additional functionalities
         * Also each new functionality demands new class for itself
         */

        // create one burger instance, then add veggies, and then add cheese on top
        Burger order1 = new BurgerShop(burger -> burger.addCheese())
                .use(new BurgerShop(burger -> burger.addVeggies())
                        .use(new Burger()));

        System.out.println("The order is : " + order1);

    }

}
