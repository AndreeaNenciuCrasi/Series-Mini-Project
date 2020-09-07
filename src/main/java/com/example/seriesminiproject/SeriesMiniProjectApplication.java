package com.example.seriesminiproject;

import com.example.seriesminiproject.model.Episode;
import com.example.seriesminiproject.repository.BaseEntityRepository;
import com.example.seriesminiproject.repository.EpisodeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SeriesMiniProjectApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(SeriesMiniProjectApplication.class, args);

        BaseEntityRepository episodeRepository = configurableApplicationContext.getBean(EpisodeRepository.class);

        Episode episode = new Episode("test", 80);
        episodeRepository.save(episode);

    }

}
