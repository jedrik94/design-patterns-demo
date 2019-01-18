package pl.jedrik94.decorator_pattern.model;

public class TransparentShape implements Shape {
    private final int transparency;
    private final Shape shape;

    public TransparentShape(Shape shape, int transparency) {
        this.shape = shape;
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
