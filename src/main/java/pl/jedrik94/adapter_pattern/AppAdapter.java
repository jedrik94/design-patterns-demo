package pl.jedrik94.adapter_pattern;

import pl.jedrik94.adapter_pattern.model.Point;
import pl.jedrik94.adapter_pattern.model.VectorObject;
import pl.jedrik94.adapter_pattern.model.VectorRectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppAdapter {
    private final static List<VectorObject> vectorObjects = new ArrayList<>(Arrays.asList(
            new VectorRectangle(2, 2, 5, 5),
            new VectorRectangle(3, 4, 6, 4)
    ));

    private static void drawPoint(Point point) {
        System.out.println(".");
    }

    public static void main(String[] args) {

    }
}
