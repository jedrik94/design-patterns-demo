package pl.jedrik94.bridge_pattern.model;

public class VectorRenderer implements Renderer {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Rendering circle with radius " + radius);
    }
}
