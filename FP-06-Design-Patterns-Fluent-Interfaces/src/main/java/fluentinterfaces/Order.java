package fluentinterfaces;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<String> cart = new ArrayList<>();
    private String address = "";

    public void add(String item){
        cart.add(item);
        System.out.println(item + " added to the cart");
    }

    public void deliverAt(String location){
        this.address = location;
        System.out.println("The delivery address set as: " + location);
    }

    public void place(){
        System.out.println("Order placed!");
        System.out.println(this.cart.size() + " items ordered will be delivered at " + this.address);
    }

}
