package org.example.jee_cats;

import java.time.LocalDate;

public class Cat {
    private String name;
    private String race;
    private String meal;
    private LocalDate birthdate;

    public Cat(String name, String race, String meal, LocalDate birthdate) {
        this.name = name;
        this.race = race;
        this.meal = meal;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getMeal() {
        return meal;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}
