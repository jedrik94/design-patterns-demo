package pl.jedrik94.factory_pattern.model;

public class CoffeeFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Grind coffee beans, put them into cup and pour " + amount + " ml of boiling water. Enjoy!");
        return new Coffee();
    }
}
