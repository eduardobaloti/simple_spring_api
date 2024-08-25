package com.simpleapi.simpleapi.game;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/games")
public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<Game> getGames() {
        return gameService.getGames();
    }

    @GetMapping("/{genre}")
    public Optional<List<Game>> getGamesByGenre(String genre) {
        return gameService.getAllGamesByGenre(genre);
    }

    @GetMapping("/{id}")
    public Optional<Game> getGame(@RequestParam Long id) {
        return gameService.getGame(id);
    }

    @PostMapping
    public Game saveGame(@RequestBody Game game) {
        return gameService.saveGame(game);
    }

}
