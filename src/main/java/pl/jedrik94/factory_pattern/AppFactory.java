package pl.jedrik94.factory_pattern;

import pl.jedrik94.factory_pattern.model.HotDrink;
import pl.jedrik94.factory_pattern.model.HotDrinkMachine;

public class AppFactory {
    public static void main(String[] args) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();

        HotDrink drink = machine.makeDrink();
        drink.consume();
    }
}
