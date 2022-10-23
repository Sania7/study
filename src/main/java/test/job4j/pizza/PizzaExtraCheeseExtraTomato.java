package test.job4j.pizza;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    @Override
    public String name() {
        return super.name() + " + " + "extra tomato";
    }
}
