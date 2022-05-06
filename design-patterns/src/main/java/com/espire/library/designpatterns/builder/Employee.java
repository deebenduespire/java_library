package com.espire.library.designpatterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private final String name;
    private final Contract contract;
    private final Skill skill;
    private final Project project;

    private Employee(Builder builder) {
        this.contract = builder.contract;
        this.name = builder.name;
        this.skill = builder.skill;
        this.project = builder.project;
    }

    @Override
    public String toString() {

        var sb = new StringBuilder();
        sb.append("This is a ")
                .append(contract)
                .append(" named ")
                .append(name);
        if (skill != null || skill != null) {
            sb.append(" with ");
            if (skill != null) {
                sb.append(skill).append(' ');
            }
            if (project != null) {
                sb.append(project).append(' ');
            }
        }
        sb.append('.');
        return sb.toString();
    }

    public static class Builder {

        private final String name;
        private final Contract contract;
        private Skill skill;
        private Project project;

        public Builder(Contract contract, String name) {
            if (contract == null || name == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.contract = contract;
            this.name = name;
        }

        public Builder withSkill(Skill skill) {
            this.skill = skill;
            return this;
        }

        public Builder withProject(Project project) {
            this.project = project;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
