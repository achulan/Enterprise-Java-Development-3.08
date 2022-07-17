package com.ironhack.Lab38.models;
import com.ironhack.Lab38.enums.Status2;

import javax.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Status2 status;

    @ManyToOne
    @JoinColumn(name="event_id")
    private Event event;

    public Guest() {
    }

    public Guest(String name, Status2 status, Event event) {
        this.name = name;
        this.status = status;
        this.event = event;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status2 getStatus() {
        return status;
    }

    public void setStatus(Status2 status) {
        this.status = status;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
