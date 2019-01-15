package pl.jedrik94.factory_pattern.model;

public class Tea implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This tea is great!");
    }
}
