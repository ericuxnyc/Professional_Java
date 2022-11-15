package model;

import java.time.LocalDate;

public class Pet {
    private String name;
    private LocalDate dob;

    public Pet(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String speak() {
        return "Woof, Woof";
    }
}
