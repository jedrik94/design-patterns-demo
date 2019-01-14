package pl.jedrik94.single_responsibility_principle.model;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    final private List<String> entries;
    private static int count;

    public Journal() {
        entries = new ArrayList<>();
    }

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    public void save(String filename) throws FileNotFoundException {
        try (PrintStream printStream = new PrintStream(filename)) {
            printStream.println(toString());
        }
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
