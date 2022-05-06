package com.espire.library.designpatterns.dip;

import java.util.List;

public interface RelationshipBrowser {

    List<Person> findAllChildrenOf(String name);
}
