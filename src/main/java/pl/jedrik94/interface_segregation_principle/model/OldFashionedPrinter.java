package pl.jedrik94.interface_segregation_principle.model;

import javax.swing.text.Document;

public class OldFashionedPrinter implements Printer {
    @Override
    public void print(Document document) {
        // Do sth
    }
}
