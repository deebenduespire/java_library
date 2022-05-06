package com.espire.library.designpatterns.dip;

import lombok.Getter;
import lombok.Setter;
import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * low-level module
 * its always better the have the implementation of a functionality inside the same class
 * we are using a list here, in future if we have to update the list to an array or something
 * else we may have to update the research class as well.
 *
 */
@Getter
@Setter
public class Relationships implements RelationshipBrowser {

    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.stream().filter(x -> x.getValue0().getName().equals("Kumar")
                && x.getValue1() == Relationship.PARENT)
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }
}
