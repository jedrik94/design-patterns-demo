package pl.jedrik94.builder_pattern.model;

public class PersonAddressBuilder extends PersonBuilder {
    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress) {
        person.setStreetAddress(streetAddress);

        return this;
    }

    public PersonAddressBuilder withPostcode(String postcode) {
        person.setPostcode(postcode);

        return this;
    }

    public PersonAddressBuilder in(String city) {
        person.setCity(city);

        return this;
    }
}
