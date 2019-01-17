package pl.jedrik94.adapter_pattern.model;

public class VectorRectangle extends VectorObject {
    public VectorRectangle(int x, int y, int width, int height) {
        add(new Line(new Point(x, y), new Point(x + width, y)));
        add(new Line(new Point(x + width, y), new Point(x + width, y + height)));
        add(new Line(new Point(x + width, y + height), new Point(x, y + height)));
        add(new Line(new Point(x, y + height), new Point(x, y)));
    }
}
