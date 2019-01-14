package pl.jedrik94.dependency_inversion_principle.model;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> findAllChildrenOfParent(String name);
}
