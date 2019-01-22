package pl.jedrik94.facade_pattern.model;

import java.util.ArrayList;
import java.util.List;

public class Console {
    private List<Viewport> viewports;
    private int width, height;

    private Console(int width, int height) {
        viewports = new ArrayList<>();
        this.width = width;
        this.height = height;
    }

    public static Console newConsole(int width, int height) {
        Buffer buffer = new Buffer(width, height);
        Viewport viewport = new Viewport(buffer, width, height, 0 , 0);
        Console console = new Console(width, height);

        console.addViewport(viewport);

        return console;
    }

    private void addViewport(Viewport viewport) {
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
