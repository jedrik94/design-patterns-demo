package pl.jedrik94.flyweight_pattern;

import pl.jedrik94.flyweight_pattern.model.BetterFormattedText;
import pl.jedrik94.flyweight_pattern.model.FormattedText;


public class AppFlyweight {
    public static void main(String[] args) {
        FormattedText formattedText = new FormattedText("OldSchool Items are fantastic and cool.");
        formattedText.capitalize(20, 29);

        System.out.println(formattedText);

        BetterFormattedText betterFormattedText = new BetterFormattedText("OldSchool Items are fantastic and cool.");
        betterFormattedText.getRange(20, 29).setCapitalize(true);
        betterFormattedText.getRange(1, 9).setCapitalize(true);

        System.out.println(betterFormattedText);
    }
}
