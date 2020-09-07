package com.example.seriesminiproject.model;

import com.fasterxml.jackson.databind.ser.Serializers;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SEASON")
public class Season extends BaseEntity {

    private Integer numberOfEpisodes;
    private String releaseDate;

    @ManyToOne
    @JoinColumn(name = "series_id")
    private Series series;

    @OneToMany(mappedBy = "season", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Episode> episodes = new ArrayList<>();

    public Season( String title, Integer numberOfEpisodes, String releaseDate) {
        super( title);
        this.releaseDate = releaseDate;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
}
