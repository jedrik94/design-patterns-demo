package pl.jedrik94.facade_pattern;

import pl.jedrik94.facade_pattern.model.Console;

public class AppFacade {
    public static void main(String[] args) {
        Console console = Console.newConsole(30, 20);
        console.render();
    }
}
