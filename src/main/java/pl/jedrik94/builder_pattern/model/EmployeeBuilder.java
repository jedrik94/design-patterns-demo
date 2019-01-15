package pl.jedrik94.builder_pattern.model;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
    public EmployeeBuilder worksAs(String position) {
        super.person.setPosition(position);

        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
