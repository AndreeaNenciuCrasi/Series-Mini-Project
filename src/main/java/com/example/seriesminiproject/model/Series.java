package com.example.seriesminiproject.model;

import org.springframework.data.repository.cdi.CdiRepositoryExtensionSupport;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SERIES")
public class Series extends BaseEntity{

    @Enumerated(value = EnumType.STRING)
    private FilmGenres filmGenres;

    private Integer numberOfSeasons;

    @Transient
    private String description;

    @OneToMany(mappedBy = "series", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Season> seasons = new ArrayList<>();

    public Series( String title, FilmGenres filmGenres, Integer numberOfSeasons, String description) {
        super( title);
        this.filmGenres = filmGenres;
        this.numberOfSeasons = numberOfSeasons;
        this.description = description;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }
}
