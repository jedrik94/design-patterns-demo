package pl.jedrik94.liskov_substitution_principle.model;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(int side) {
        this.width = this.height = side;
    }

    @Override
    public void setWidth(int width) {
        super.setHeight(width);
        super.setWidth(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
