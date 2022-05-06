package com.espire.library.designpatterns.builder;

public class Main {

    public static void main(String[] args) {
        var intern = new Employee.Builder(Contract.INTERN, "Shubham")
                .withSkill(Skill.JAVA)
                .withProject(Project.JAVA_STANDARD_COE)
                .build();
    }
}
