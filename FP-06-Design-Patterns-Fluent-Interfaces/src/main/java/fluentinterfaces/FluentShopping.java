package fluentinterfaces;

public class FluentShopping {
    public static void main(String[] args) {

        /**
         * A fluent interface provides an easy-readable, flowing interface, that often mimics a domain specific
         * language. Using this pattern results in code that can be read nearly as human language.
         */

        // Order class is kinda API to add and place orders
        // regular approach which is not fluent
//        Order myOrder1 = new Order();
//        myOrder1.add("Shoes");
//        myOrder1.add("Headphones");
//        myOrder1.deliverAt("4517 Green street");
//        myOrder1.place();

        // We can use method chaining in order to improve the code
        // it will allow us to execute methods in a single chain
        // we will need to modify Order methods to return Order object again after applying some functionality

        Order.place(order ->
                order.add("T shirt")
                     .add("Jeans")
                     .deliverAt("1145 Main St"));

    }
}
