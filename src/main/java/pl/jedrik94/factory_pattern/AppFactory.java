package pl.jedrik94.factory_pattern;

import pl.jedrik94.factory_pattern.model.Point;

public class AppFactory {
    public static void main(String[] args) {
        Point dot1 = Point.Factory.newCartesianPoint(1, 0 );
        Point dot2 = Point.Factory.newPolarPoint(1, 0);

        System.out.println(dot1);
        System.out.println(dot2);
    }
}
