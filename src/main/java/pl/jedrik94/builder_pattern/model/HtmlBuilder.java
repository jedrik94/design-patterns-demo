package pl.jedrik94.builder_pattern.model;

public class HtmlBuilder {
    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        this.root.setName(rootName);
    }

    public HtmlBuilder addChild(String childName, String childText) {
        HtmlElement htmlElement = new HtmlElement(childName, childText);

        root.addHtmlElement(htmlElement);

        return this;
    }

    public void clear() {
        root = new HtmlElement();
        root.setName(rootName);
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
