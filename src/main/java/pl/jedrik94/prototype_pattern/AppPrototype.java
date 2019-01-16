package pl.jedrik94.prototype_pattern;

import org.apache.commons.lang3.SerializationUtils;
import pl.jedrik94.prototype_pattern.model.Person;
import pl.jedrik94.prototype_pattern.model.Address;

public class AppPrototype {
    public static void main(String[] args) {
        Person jedrzej = new Person("Jedrzej", new Address("LesznoStreet", "Leszno", "Poland"));

        Person milosz = SerializationUtils.roundtrip(jedrzej);
        milosz.setName("Milosz");

        System.out.println(jedrzej);
        System.out.println(milosz);
    }
}
