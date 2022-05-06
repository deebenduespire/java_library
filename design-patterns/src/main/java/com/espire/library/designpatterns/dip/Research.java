package com.espire.library.designpatterns.dip;

import org.javatuples.Triplet;

import java.util.List;

/**
 * high-level module
 */
public class Research {

//    public Research(Relationships relationships) {
//        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
//        relations.stream().filter(x -> x.getValue0().getName().equals("Kumar")
//                && x.getValue1() == Relationship.PARENT)
//                .forEach(ch -> System.out.println("Kumar has a child " + ch.getValue2().getName()));
//    }

    public Research(RelationshipBrowser browser) {
        List<Person> children = browser.findAllChildrenOf("Kumar");
        for (Person child : children) {
            System.out.println("Children are " + child.getName());
        }
    }
}
