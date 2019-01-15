package pl.jedrik94.builder_pattern.model;

public class EmployeeBuilder extends PersonBuilder {
    public EmployeeBuilder worksAs(String position) {
        super.person.setPosition(position);

        return this;
    }
}
