package decoratorpatternfunctional;

import java.util.function.Function;

public class BurgerShop {
    // This class will be responsible for adding decorations

    Function<Burger,Burger> decoration;

    // constructor
    public BurgerShop(Function<Burger,Burger> decoration){
        this.decoration = decoration;
    }

    // decoration function will be executed with the baseBurger as an import
    public Burger use(Burger baseBurger){
        System.out.println("BaseBurger : " + baseBurger);
        return decoration.apply(baseBurger);
    }

}
