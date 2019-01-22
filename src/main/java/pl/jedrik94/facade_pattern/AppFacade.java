package pl.jedrik94.facade_pattern;

import pl.jedrik94.facade_pattern.model.Buffer;
import pl.jedrik94.facade_pattern.model.Console;
import pl.jedrik94.facade_pattern.model.Viewport;

public class AppFacade {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(30, 20);
        Viewport viewport = new Viewport(buffer, 30, 20, 0, 0);
        Console console = new Console(30, 20);
        console.addViewport(viewport);
        console.render();
    }
}
