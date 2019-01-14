package pl.jedrik94.dependency_inversion_principle;

import pl.jedrik94.dependency_inversion_principle.model.Person;
import pl.jedrik94.dependency_inversion_principle.model.Relationships;
import pl.jedrik94.dependency_inversion_principle.model.Research;

public class AppDIP {
    public static void main(String[] args) {
        Person parent = new Person("Janusz");
        Person child1 = new Person("Adam");
        Person child2 = new Person("Ewa");

        Relationships relationships = new Relationships();
        relationships.addParentAndChildren(parent, child1);
        relationships.addParentAndChildren(parent, child2);

        new Research(relationships);
    }
}
