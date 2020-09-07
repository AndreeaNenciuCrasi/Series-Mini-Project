package com.example.seriesminiproject.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EPISODE")
public class Episode extends BaseEntity{

    private Integer duration;
    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;


    public Episode( String title, Integer duration) {
        super( title);
        this.duration = duration;
    }
}
