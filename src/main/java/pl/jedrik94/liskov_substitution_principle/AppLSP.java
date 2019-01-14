package pl.jedrik94.liskov_substitution_principle;

import pl.jedrik94.liskov_substitution_principle.model.Rectangle;
import pl.jedrik94.liskov_substitution_principle.model.Square;

public class AppLSP {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        useIt(rectangle);

        Rectangle square = new Square(5);
        useIt(square);
    }

    static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);

        System.out.println("Expected area of " + (width * 10) +
                ", got " + rectangle.getArea());
    }
}
