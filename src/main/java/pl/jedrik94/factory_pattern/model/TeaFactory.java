package pl.jedrik94.factory_pattern.model;

public class TeaFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Put tea bag into cup, pour " + amount + " ml of hot but not boiling water. Enjoy!");
        return new Tea();
    }
}
