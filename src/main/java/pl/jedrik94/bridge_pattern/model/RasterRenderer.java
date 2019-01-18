package pl.jedrik94.bridge_pattern.model;

public class RasterRenderer implements Renderer {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Rendering circle raster by raster with radius " + radius);
    }
}
