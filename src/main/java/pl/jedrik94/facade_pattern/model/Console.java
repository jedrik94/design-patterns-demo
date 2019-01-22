package pl.jedrik94.facade_pattern.model;

import java.util.ArrayList;
import java.util.List;

public class Console {
    private List<Viewport> viewports;
    private int width, height;

    public Console(int width, int height) {
        viewports = new ArrayList<>();
        this.width = width;
        this.height = height;
    }

    public void addViewport(Viewport viewport) {
        viewports.add(viewport);
    }

    public void render() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                for (Viewport viewport : viewports) {
                    System.out.print(viewport.charAt(x, y));
                }
            }
            System.out.println();
        }
    }
}
