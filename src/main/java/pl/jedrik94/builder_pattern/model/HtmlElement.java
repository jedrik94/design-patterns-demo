package pl.jedrik94.builder_pattern.model;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    private String name, text;
    private ArrayList<HtmlElement> elements;

    public HtmlElement() {
        elements = new ArrayList<>();
    }

    public HtmlElement(String name, String text) {
        elements = new ArrayList<>();

        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }

    public void addHtmlElement(HtmlElement element) {
        HtmlElement e = element;
        elements.add(element);
    }

    private String toStringImpl(int indent) {
        StringBuilder stringBuilder = new StringBuilder();
        String indentString = String.join("", Collections.nCopies(indentSize * indent, " "));

        stringBuilder.append(String.format("%s<%s>%s", indentString, name, newLine));
        if (text != null && !text.isEmpty()) {
            stringBuilder.append(String.join("", Collections.nCopies(indentSize * (indent + 1), " ")))
            .append(text)
            .append(newLine);
        }

        for (HtmlElement e : elements) {
            stringBuilder.append(e.toStringImpl(indent + 1));
        }

        stringBuilder.append(String.format("%s<%s>%s", indentString, name, newLine));

        return stringBuilder.toString();
    }
}
