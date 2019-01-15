package pl.jedrik94.builder_pattern;

import pl.jedrik94.builder_pattern.model.EmployeeBuilder;
import pl.jedrik94.builder_pattern.model.Person;

public class AppBuilder {
    public static void main(String[] args) {
        EmployeeBuilder personBuilder = new EmployeeBuilder();

        Person jedrzej = personBuilder
                .withName("Jedrzej")
                .worksAs("software engineer")
                .build();

        System.out.println(jedrzej);
    }
}
