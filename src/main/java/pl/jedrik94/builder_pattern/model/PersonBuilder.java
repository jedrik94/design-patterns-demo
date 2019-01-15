package pl.jedrik94.builder_pattern.model;

public class PersonBuilder {
    protected Person person;

    public PersonBuilder() {
        person = new Person();
    }

    public PersonBuilder withName(String name) {
        person.setName(name);

        return this;
    }

    public Person build() {
        return person;
    }
}
