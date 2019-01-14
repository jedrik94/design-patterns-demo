package pl.jedrik94.dependency_inversion_principle.model;

import org.javatuples.Triplet;

import java.util.List;

public class Research {
    public Research(Relationships relationships) {
        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();

        relations.stream()
                .filter(relation -> relation.getValue0().getName().equals("Janusz") &&
                        relation.getValue1().equals(Relationship.PARENT))
                .forEach(relation ->
                        System.out.println("Janusz has a child named " + relation.getValue2().getName()));
    }
}
