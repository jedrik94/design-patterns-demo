package pl.jedrik94.decorator_pattern.model;

public class ColoredShape implements Shape {
    private final String color;
    private final Shape shape;

    public ColoredShape(Shape shape, String color) {
        this.color = color;
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String info() {
        return shape.info() + " is " + getColor();
    }
}
