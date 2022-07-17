package com.ironhack.Lab38.models;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Conference extends Event {

    @OneToMany(mappedBy="conference")
    private List<Speaker> speakers;

    public Conference() {
    }

    public Conference(Date date, double duration, String location, String title) {
        super(date, duration, location, title);
    }
}
