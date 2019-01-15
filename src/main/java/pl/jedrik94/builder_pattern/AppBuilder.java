package pl.jedrik94.builder_pattern;

import pl.jedrik94.builder_pattern.model.Person;
import pl.jedrik94.builder_pattern.model.PersonBuilder;

public class AppBuilder {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        Person jedrzej = personBuilder
                .withName("Jedrzej")
                .build();

        System.out.println(jedrzej);
    }
}
