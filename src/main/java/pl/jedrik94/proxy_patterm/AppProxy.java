package pl.jedrik94.proxy_patterm;

import pl.jedrik94.proxy_patterm.model.Car;
import pl.jedrik94.proxy_patterm.model.CarProxy;
import pl.jedrik94.proxy_patterm.model.Driver;

public class AppProxy {
    public static void main(String[] args) {
        Car car = new CarProxy(new Driver(15));
        car.drive();
    }
}
