package com.example.seriesminiproject.repository;

import com.example.seriesminiproject.model.Episode;
import com.example.seriesminiproject.model.EpisodeSQL;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpisodeRepositorySQl extends CrudRepository<EpisodeSQL, Long> {
    List<EpisodeSQL> findAllByTitle(String title);
}