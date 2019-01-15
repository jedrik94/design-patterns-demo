package pl.jedrik94.builder_pattern;

import pl.jedrik94.builder_pattern.model.HtmlBuilder;

public class AppBuilder {
    public static void main(String[] args) {
        HtmlBuilder htmlBuilder = new HtmlBuilder("ul");
        htmlBuilder.addChild("li", "car")
                .addChild("li", "tree")
                .addChild("li", "house");

        System.out.println(htmlBuilder.toString());
    }
}
