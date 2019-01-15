package pl.jedrik94.factory_pattern.model;

public class Point {
    private double x, y;

    public Point(double a, double b, CoordinateSystem coordinateSystem) {
        switch (coordinateSystem) {
            case CARTESIAN:
                x = a;
                y = b;
                break;
            case POLAR:
                x = a * Math.cos(b);
                y = a * Math.sin(a);
                break;
        }
    }
}
