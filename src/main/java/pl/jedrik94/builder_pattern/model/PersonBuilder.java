package pl.jedrik94.builder_pattern.model;

public class PersonBuilder {
    protected Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public Person build() {
        return person;
    }
}
