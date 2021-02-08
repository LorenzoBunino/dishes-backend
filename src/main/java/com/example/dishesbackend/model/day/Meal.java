package com.example.dishesbackend.model.day;

import javax.persistence.Embeddable;

@Embeddable
public class Meal {
    private String wash; // rename to who_washed ?
    private String rinse; // rename to who_rinsed ?

    public Meal(String wash, String rinse) {
        this.wash = wash;
        this.rinse = rinse;
    }

    protected Meal(){}

    public String getWash() {
        return wash;
    }

    public void setWash(String wash) {
        this.wash = wash;
    }

    public String getRinse() {
        return rinse;
    }

    public void setRinse(String rinse) {
        this.rinse = rinse;
    }
}
