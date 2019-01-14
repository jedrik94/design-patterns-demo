package pl.jedrik94.interface_segregation_principle.model;

import javax.swing.text.Document;

public class MultipurposePrinter implements Printer, Scanner {
    @Override
    public void print(Document document) {
        // Do sth
    }

    @Override
    public void scan(Document document) {
        // Do sth
    }
}
