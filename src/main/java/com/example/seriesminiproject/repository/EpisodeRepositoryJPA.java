package com.example.seriesminiproject.repository;

import com.example.seriesminiproject.model.EpisodeSQL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepositoryJPA extends JpaRepository<EpisodeSQL, Long> {
    @Query("select u from EpisodeSQL u where u.duration = ?1")
    EpisodeSQL findByDuration(Integer duration);
}
