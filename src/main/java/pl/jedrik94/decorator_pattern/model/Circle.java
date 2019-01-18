package pl.jedrik94.decorator_pattern.model;

public class Circle implements Shape {
    private final String name;
    private int radius;

    public Circle(int radius) {
        this.name = "Circle";
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public void resize(int factor) {
        radius *= factor;
    }

    @Override
    public String info() {
        return "This is " + getName() + " with radius " + getRadius();
    }
}
