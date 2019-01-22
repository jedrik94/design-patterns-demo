package pl.jedrik94.proxy_pattern.model;

public class Car implements Drivable {
    protected Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("Car been driven.");
    }
}
