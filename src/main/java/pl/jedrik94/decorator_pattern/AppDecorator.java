package pl.jedrik94.decorator_pattern;

import pl.jedrik94.decorator_pattern.model.MagicString;

public class AppDecorator {
    public static void main(String[] args) {
        MagicString magicString = new MagicString("qwertyuiopasdfghhjklzxcvbnnm");

        System.out.println("\"" + magicString + "\" has " + magicString.getNumberOfVowels() + " vowels.");
    }
}
