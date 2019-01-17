package pl.jedrik94.adapter_pattern;

import pl.jedrik94.adapter_pattern.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppAdapter {
    private final static List<VectorObject> vectorObjects = new ArrayList<>(Arrays.asList(
            new VectorRectangle(0, 0, 5, 5),
            new VectorRectangle(5, 5, 5, 5)
    ));

    private static void drawPoint(Point point) {
        System.out.println(".");
    }

    private static void draw() {
        for (VectorObject vectorObject : vectorObjects) {
            for (Line line : vectorObject) {
                Line2PointAdapter adapter = new Line2PointAdapter(line);
                adapter.forEach(AppAdapter::drawPoint);
            }
        }
    }

    public static void main(String[] args) {
        draw();
    }
}
