package com.simpleapi.simpleapi.game;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getGames() {
        return gameRepository.findAll();
    }

    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    public Optional<Game> getGame(Long id) {
        return gameRepository.findById(id);
    }

    public Optional<List<Game>> getAllGamesByGenre(String genre) {
        return gameRepository.getAllGamesByGenre(genre);
    }

}