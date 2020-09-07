package com.example.seriesminiproject.model;

import javax.persistence.*;

@Entity
@Table(name = "EPISODESQL")
public class EpisodeSQL {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer duration;

    public EpisodeSQL(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }

    public EpisodeSQL() {
    }

    @Override
    public String toString() {
        return "EpisodeSQL{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
