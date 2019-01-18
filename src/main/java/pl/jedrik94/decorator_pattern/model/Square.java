package pl.jedrik94.decorator_pattern.model;

public class Square implements Shape {
    private final String name;
    private int side;

    public Square(int side) {
        this.name = "Square";
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public int getSide() {
        return side;
    }

    public void resize(int factor) {
        side *= factor;
    }

    @Override
    public String info() {
        return "This is " + getName() + " with side " + getSide();
    }
}
