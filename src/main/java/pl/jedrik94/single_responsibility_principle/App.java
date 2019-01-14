package pl.jedrik94.single_responsibility_principle;

import pl.jedrik94.single_responsibility_principle.model.Journal;

public class App {
    public static void main(String[] args) {
        Journal journal = new Journal();

        journal.addEntry("Morning was great!");
        journal.addEntry("Breakfast was kind of awful!");

        System.out.println(journal);
    }
}
