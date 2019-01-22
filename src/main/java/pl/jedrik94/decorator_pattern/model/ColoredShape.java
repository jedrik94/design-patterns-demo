package pl.jedrik94.decorator_pattern.model;

import java.util.function.Supplier;

public class ColoredShape<T extends Shape> implements Shape {
    private final String color;
    private final Shape shape;

    public ColoredShape(Supplier<T> supplier, String color) {
        this.color = color;
        this.shape = supplier.get();
    }

    public String getColor() {
        return color;
    }

    @Override
    public String info() {
        return shape.info() + " is " + getColor();
    }
}
