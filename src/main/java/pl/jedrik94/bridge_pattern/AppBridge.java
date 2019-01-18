package pl.jedrik94.bridge_pattern;

import com.google.inject.Guice;
import com.google.inject.Injector;
import pl.jedrik94.bridge_pattern.model.*;

public class AppBridge {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ShapeModule());

        Circle circle = injector.getInstance(Circle.class);

        circle.setRadius(5);

        circle.draw();
        circle.resize(2);
        circle.draw();
    }
}
