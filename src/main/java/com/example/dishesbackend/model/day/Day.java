package com.example.dishesbackend.model.day;

import com.example.dishesbackend.model.day.Meal;

import javax.persistence.*;

@Entity
@Table(schema = "days")
public class Day {

    @Id
    private int id;

    private String date; // TODO: refactor to use @DateTimeFormat

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "wash", column = @Column(name = "lunch_wash")),
            @AttributeOverride(name = "rinse", column = @Column(name = "lunch_rinse"))
    })
    private Meal lunch;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "wash", column = @Column(name = "dinner_wash")),
            @AttributeOverride(name = "rinse", column = @Column(name = "dinner_rinse"))
    })
    private Meal dinner;
}
