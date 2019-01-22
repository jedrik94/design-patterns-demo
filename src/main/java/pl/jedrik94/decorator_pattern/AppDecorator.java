package pl.jedrik94.decorator_pattern;

import pl.jedrik94.decorator_pattern.model.MagicStringBuilder;

public class AppDecorator {
    public static void main(String[] args) {
        MagicStringBuilder stringBuilder = new MagicStringBuilder("Hi!");
        stringBuilder.append(" My name is Jedrzej.")
                .appendLine(" And this presents some features of Adapter-Decorator.");
        System.out.println(stringBuilder.concate("Yea, not joking."));
    }
}
