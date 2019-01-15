package pl.jedrik94.builder_pattern.model;

import lombok.Data;

@Data
public class Person {
    private String streetAddress;
    private String postcode;
    private String city;

    private String companyName;
    private String position;
    private int annualIncome;
}
