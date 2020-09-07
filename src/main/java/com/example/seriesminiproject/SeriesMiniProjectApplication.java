package com.example.seriesminiproject;

import com.example.seriesminiproject.model.Episode;
import com.example.seriesminiproject.model.EpisodeSQL;
import com.example.seriesminiproject.repository.BaseEntityRepository;
import com.example.seriesminiproject.repository.EpisodeRepository;
import com.example.seriesminiproject.repository.EpisodeRepositorySQl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.repository.Repository;

@SpringBootApplication
public class SeriesMiniProjectApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(SeriesMiniProjectApplication.class, args);

        BaseEntityRepository episodeRepository = configurableApplicationContext.getBean(EpisodeRepository.class);
        EpisodeRepositorySQl episodeRepositorySQL = configurableApplicationContext.getBean(EpisodeRepositorySQl.class);

        EpisodeSQL episode1 = new EpisodeSQL("test", 80);
        EpisodeSQL episode2 = new EpisodeSQL("app", 70);
        episodeRepositorySQL.save(episode1);
        episodeRepositorySQL.save(episode2);
        System.out.println(episodeRepositorySQL.findAllByTitle("test"));

    }

}
