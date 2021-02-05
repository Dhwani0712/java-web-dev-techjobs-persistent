package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message ="Location is required")
    @Size(min = 3, max= 255, message= "Location must be between 3 and 255 characters")
    private String location;

    //Constructors
    public Employer() {

    }
    public Employer(String location) {
        super();
        this.location = location;
    }

    //getters and setters

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
