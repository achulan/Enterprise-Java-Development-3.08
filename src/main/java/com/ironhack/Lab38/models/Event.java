package com.ironhack.Lab38.models;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date;
    private Double duration;
    private String location;
    private String title;

    @OneToMany(mappedBy="event")
    private List<Guest> guests;

    public Event() {
    }

    public Event(Date date, double duration, String location, String title) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
}
