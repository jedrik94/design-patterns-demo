package pl.jedrik94.decorator_pattern.model;

import java.util.function.Supplier;

public class TransparentShape<T extends Shape> implements Shape {
    private final int transparency;
    private final Shape shape;

    public TransparentShape(Supplier<T> supplier, int transparency) {
        this.shape = supplier.get();
        this.transparency = transparency;
    }

    public int getTransparency() {
        return transparency;
    }

    @Override
    public String info() {
        return shape.info() + " with transparency at " + getTransparency() + "%";
    }
}
