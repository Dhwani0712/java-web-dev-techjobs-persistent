package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;


@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message ="Description is required")
    private String description;

// Constructors
    public Skill() {
    }

    public Skill(String description) {
        super();
        this.description = description;
    }

    //getter and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}