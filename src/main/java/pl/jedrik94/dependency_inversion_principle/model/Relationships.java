package pl.jedrik94.dependency_inversion_principle.model;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Relationships implements RelationshipBrowser{
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

    @Override
    public List<Person> findAllChildrenOfParent(String name) {
        return relations.stream()
                .filter(relation -> Objects.equals(relation.getValue0().getName(), name))
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }
}
