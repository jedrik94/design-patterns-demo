package pl.jedrik94.builder_pattern.model;

public class PersonJobBuilder extends PersonBuilder {
    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder worksAt(String companyName) {
        person.setCompanyName(companyName);

        return this;
    }

    public PersonJobBuilder asA(String position) {
        person.setPosition(position);

        return this;
    }

    public PersonJobBuilder earning(int annualIncome) {
        person.setAnnualIncome(annualIncome);

        return this;
    }
}
