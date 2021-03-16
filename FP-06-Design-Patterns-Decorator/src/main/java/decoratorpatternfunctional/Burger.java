package decoratorpatternfunctional;

public class Burger {

    private String burgerType;

    // public constructor - create a plain burger with no decorations, burgerType = blank string
    public Burger() {
        this.burgerType = "";
    }

    // private constructor - only to be used inside Burger class
    private Burger(String burgerType) {
        this.burgerType = burgerType;
    }

    // methods to add functionality (add decorations)
    // add decorations on top and returns fresh instance of the Burger class
    // in functional programming you don't modify the state of the object, you return new instance and make it look
    // like modification on the current object
    public Burger addVeggies(){
        System.out.println("Adding veggies to the burger");
        return new Burger(this.burgerType += " Veggie");
    }

    public Burger addCheese(){
        System.out.println("Adding cheese to the burger");
        return new Burger(this.burgerType += " Cheese");
    }

    // printing Burger type
    @Override
    public String toString() {
        return String.format("%s", burgerType + " burger");
    }
}
