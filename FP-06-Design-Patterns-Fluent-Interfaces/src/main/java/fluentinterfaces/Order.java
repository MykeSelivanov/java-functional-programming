package fluentinterfaces;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<String> cart = new ArrayList<>();
    private String address = "";

    public Order(){
    }

    public Order(List<String> cart, String address) {
        this.cart = cart;
        this.address = address;
    }

    public Order add(String item){
        cart.add(item);
        System.out.println(item + " added to the cart");
        return new Order(this.cart, this.address);
    }

    public Order deliverAt(String location){
        this.address = location;
        System.out.println("The delivery address set as: " + location);
        return new Order(this.cart, this.address);
    }

    public void place(){
        System.out.println("Order placed!");
        System.out.println(this.cart.size() + " items ordered will be delivered at " + this.address);
    }

}
