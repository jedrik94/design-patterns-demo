package pl.jedrik94.composite_pattern;

import pl.jedrik94.composite_pattern.model.Circle;
import pl.jedrik94.composite_pattern.model.GraphicObject;
import pl.jedrik94.composite_pattern.model.Square;

import java.util.Arrays;

public class AppComposite {
    public static void main(String[] args) {
        GraphicObject drawing = new GraphicObject();
        drawing.setName("My Drawing");
        drawing.addChild(new Square("Red"));
        drawing.addChild(new Circle("Blue"));

        GraphicObject group1 = new GraphicObject();
        group1.addChildren(Arrays.asList(new Circle("Green"), new Square("Black")));

        GraphicObject group2 = new GraphicObject();
        group2.addChildren(Arrays.asList(new Circle("Yellow"), new Square("White")));

        drawing.addChild(group1);
        drawing.addChild(group2);

        System.out.println(drawing);
    }
}
