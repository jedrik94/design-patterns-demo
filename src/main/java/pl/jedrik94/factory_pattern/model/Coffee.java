package pl.jedrik94.factory_pattern.model;

public class Coffee implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee is awesome!");
    }
}
