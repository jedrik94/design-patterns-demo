package pl.jedrik94.dependency_inversion_principle.model;

import java.util.List;

public class Research {
    public Research(RelationshipBrowser relationshipBrowser) {
        List<Person> children = relationshipBrowser.findAllChildrenOfParent("Janusz");
        for (Person child : children) {
            System.out.println("Janusz has a child named " + child.getName());
        }
    }
}
