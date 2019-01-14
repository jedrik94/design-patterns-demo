package pl.jedrik94.single_responsibility_principle;

import pl.jedrik94.single_responsibility_principle.model.Journal;
import pl.jedrik94.single_responsibility_principle.model.Persistence;

public class App {
    public static void main(String[] args) throws Exception {
        Journal journal = new Journal();

        journal.addEntry("Morning was great!");
        journal.addEntry("Breakfast was kind of awful!");

        System.out.println(journal);

        Persistence persistence = new Persistence();
        String filename = "C:\\temp\\file.txt";

        persistence.saveToFile(journal, filename, true);

        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
