package pl.jedrik94.interface_segregation_principle.model;

import javax.swing.text.Document;

public interface Machine {
    void print(Document document);

    void scan(Document document) throws Exception;

    void fax(Document document);
}
