package pl.jedrik94.prototype_pattern;

import pl.jedrik94.prototype_pattern.model.Person;
import pl.jedrik94.prototype_pattern.model.Address;

public class AppPrototype {
    public static void main(String[] args) {
        Person jedrzej = new Person("Jedrzej", new Address("LesznoStreet", "Leszno", "Poland"));

        Person milosz = new Person(jedrzej);
        milosz.setName("Milosz");

        System.out.println(jedrzej);
        System.out.println(milosz);
    }
}
