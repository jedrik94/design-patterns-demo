package pl.jedrik94.bridge_pattern.model;

import com.google.inject.Inject;

public class Circle extends Shape {
    private int radius;

    @Inject
    public Circle(Renderer renderer) {
        super(renderer);
    }

    public Circle(Renderer renderer, int radius) {
        super(renderer);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
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
