package pl.jedrik94.bridge_pattern.model;

public class Circle extends Shape {
    private int radius;

    public Circle(Renderer renderer) {
        super(renderer);
    }

    public Circle(Renderer renderer, int radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.drawCircle(radius);
    }

    @Override
    public void resize(int factor) {
        this.radius *= factor;
    }
}
