package pl.jedrik94.factory_pattern.model;

import javafx.util.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotDrinkMachine {
    private List<Pair<String, HotDrinkFactory>> namedFactories;

    public HotDrinkMachine() throws Exception {
        namedFactories = new ArrayList<>();

        Set<Class<? extends HotDrinkFactory>> types =
                new Reflections("pl.jedrik94.factory_pattern.model").getSubTypesOf(HotDrinkFactory.class);

        for (Class<? extends HotDrinkFactory> type : types) {
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }
    }

    public HotDrink makeDrink() throws Exception {
        System.out.println("Available drinks:");
        for (int index = 0; index < namedFactories.size(); index++) {
            Pair<String, HotDrinkFactory> item = namedFactories.get(index);
            System.out.println("" + index + " - " + item.getKey());
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String inputString;
            int index, amount;

            if ((inputString = bufferedReader.readLine()) != null
                    && (index = Integer.parseInt(inputString)) >= 0
                    && index < namedFactories.size()) {
                System.out.println("Specify amount: ");

                inputString = bufferedReader.readLine();

                if (inputString != null && (amount = Integer.parseInt(inputString)) > 0) {
                    return namedFactories.get(index).getValue().prepare(amount);
                }
            }

            System.out.println("Something went wrong. Try again.");
        }
    }
}
