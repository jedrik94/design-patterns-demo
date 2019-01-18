package pl.jedrik94.decorator_pattern;

import pl.jedrik94.decorator_pattern.model.Circle;
import pl.jedrik94.decorator_pattern.model.ColoredShape;
import pl.jedrik94.decorator_pattern.model.Square;
import pl.jedrik94.decorator_pattern.model.TransparentShape;

public class AppDecorator {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape coloredSquare = new ColoredShape(new Square(10), "Blue");
        System.out.println(coloredSquare.info());

        TransparentShape transparentColoredShape = new TransparentShape(
                new ColoredShape(new Circle(3), "Red"),
                85
        );
        System.out.println(transparentColoredShape.info());

        ColoredShape coloredTransparentShape = new ColoredShape(
                new TransparentShape(new Square(99), 25),
                "Green"
        );
        System.out.println(coloredTransparentShape.info());
    }
}
