package com.ironhack.Lab38.models;
import javax.persistence.*;
import java.util.List;

@Entity
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy="association")
    private List<com.ironhack.Lab38.models.Chapter> chapters;

    public Association() {
    }

    public Association(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }
}
