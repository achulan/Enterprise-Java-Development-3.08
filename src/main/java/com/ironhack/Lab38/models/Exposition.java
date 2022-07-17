package com.ironhack.Lab38.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Exposition extends Event {

    public Exposition() {
    }

    public Exposition(Date date, double duration, String location, String title) {
        super(date, duration, location, title);
    }

}
