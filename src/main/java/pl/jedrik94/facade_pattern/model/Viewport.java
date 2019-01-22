package pl.jedrik94.facade_pattern.model;

public class Viewport {
    private Buffer buffer;
    private int width;
    private int height;
    private int offsetX;
    private int offsetY;

    public Viewport(Buffer buffer, int width, int height,
                    int offsetX, int offsetY) {
        this.buffer = buffer;
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    public char charAt(int x, int y) {
        return buffer.charAt(x + offsetX, y + offsetY);
    }
}
