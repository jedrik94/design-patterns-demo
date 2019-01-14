package pl.jedrik94.dependency_inversion_principle.model;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;

public class Relationships {
    private List<Triplet<Person, Relationship, Person>> relations;

    public Relationships() {
        this.relations = new ArrayList<>();
    }

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    public void addParentAndChildren(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }
}
