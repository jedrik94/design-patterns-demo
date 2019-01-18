package pl.jedrik94.composite_pattern.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GraphicObject {
    protected String name = "Group";
    protected String color;

    protected List<GraphicObject> children;

    public GraphicObject() {
        children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return print(0);
    }

    private String print(int depth) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.join("", Collections.nCopies(depth, "*")))
                .append(depth > 0 ? " " :"")
                .append((color == null || color.isEmpty()) ? "" : getColor() + " ")
                .append(getName())
                .append(System.lineSeparator());

        for (GraphicObject child : children) {
            stringBuilder.append(child.print(depth + 1));
        }

        return stringBuilder.toString();
    }

    public void addChildren(Collection<GraphicObject> newChildren) {
        children.addAll(newChildren);
    }

    public void addChild(GraphicObject newChild) {
        children.add(newChild);
    }
}
