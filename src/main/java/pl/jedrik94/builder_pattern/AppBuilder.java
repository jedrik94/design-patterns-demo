package pl.jedrik94.builder_pattern;

import pl.jedrik94.builder_pattern.model.HtmlBuilder;

public class AppBuilder {
    public static void main(String[] args) {
        HtmlBuilder htmlBuilder = new HtmlBuilder("ul");
        htmlBuilder.addChild("li", "car");
        htmlBuilder.addChild("li", "tree");
        htmlBuilder.addChild("li", "house");

        System.out.println(htmlBuilder.toString());
    }
}
