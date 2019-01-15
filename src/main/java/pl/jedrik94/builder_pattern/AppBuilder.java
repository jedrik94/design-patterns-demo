package pl.jedrik94.builder_pattern;

import pl.jedrik94.builder_pattern.model.Person;
import pl.jedrik94.builder_pattern.model.PersonBuilder;

public class AppBuilder {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder
                .works()
                    .asA("engineer")
                    .earning(9999)
                    .worksAt("Dot Company")
                .lives()
                    .at("Aeronautics 1")
                    .withPostcode("65432")
                    .in("Poznan")
                .build();

        System.out.println(person);
    }
}
