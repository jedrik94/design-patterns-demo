package pl.jedrik94.builder_pattern;

public class AppBuilder {
    public static void main(String[] args) {
        String hello = "hello";
        System.out.println("<p>" + hello + "</p>");

        String[] words = {"house", "tree", "cat"};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<ul>\n");
        for (String word : words) {
            stringBuilder.append(String.format("  <li>%s</li>\n", word));
        }
        stringBuilder.append("</ul>\n");

        System.out.println(stringBuilder);
    }
}
