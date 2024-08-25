package com.simpleapi.simpleapi.game;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
    @Bean
    CommandLineRunner CommandLineRunner(
            GameRepository gameRepository) {
        return args -> {
            Game Sonic = new Game(1L, "Sonic the Hedgehog", "Action", 1991);
            Game Sonic2 = new Game(2L, "Sonic the Hedgehog 2", "Action", 1992);
            Game SuperMario = new Game(3L, "Super Mario Bros.", "Adventure", 1985);
            Game Zelda = new Game(4L, "The Legend of Zelda", "Adventure", 1986);
            Game Metroid = new Game(5L, "Metroid", "Adventure", 1986);
            Game StreetFighter = new Game(6L, "Street Fighter II", "Action", 1991);
            Game MegaMan = new Game(7L, "Mega Man 2", "Adventure", 1988);
            Game Castlevania = new Game(8L, "Castlevania", "Action", 1986);
            gameRepository
                    .saveAll(List.of(Sonic, Sonic2, SuperMario, Zelda, Metroid, StreetFighter, MegaMan, Castlevania));
        };
    }
}
