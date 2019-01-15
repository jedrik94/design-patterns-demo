package pl.jedrik94.builder_pattern.model;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
    protected Person person;

    public PersonBuilder() {
        person = new Person();
    }

    public SELF withName(String name) {
        person.setName(name);

        return self();
    }

    public Person build() {
        return person;
    }

    protected SELF self() {
        return (SELF) this;
    }
}
