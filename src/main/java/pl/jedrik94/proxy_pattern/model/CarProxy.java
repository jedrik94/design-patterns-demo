package pl.jedrik94.proxy_pattern.model;

public class CarProxy extends Car {
    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if (super.driver.getAge() >= 16) {
            super.drive();
        } else {
            System.out.println("Driver too young.");
        }
    }
}
