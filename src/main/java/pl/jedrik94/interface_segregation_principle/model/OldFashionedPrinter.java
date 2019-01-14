package pl.jedrik94.interface_segregation_principle.model;

import javax.swing.text.Document;

public class OldFashionedPrinter implements Machine {
    @Override
    public void print(Document document) {
        // Do sth
    }

    @Override
    public void scan(Document document) throws Exception {
        // Can't do that
        throw new Exception("Can't do this.");
    }

    @Override
    public void fax(Document document) {
        // Do sth
    }
}
