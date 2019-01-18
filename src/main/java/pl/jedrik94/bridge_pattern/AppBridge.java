package pl.jedrik94.bridge_pattern;

import pl.jedrik94.bridge_pattern.model.Circle;
import pl.jedrik94.bridge_pattern.model.RasterRenderer;
import pl.jedrik94.bridge_pattern.model.Renderer;
import pl.jedrik94.bridge_pattern.model.VectorRenderer;

public class AppBridge {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        RasterRenderer raster = new RasterRenderer();

        Circle circle = new Circle(vector, 5);

        circle.draw();
        circle.resize(3);
        circle.draw();
    }
}
