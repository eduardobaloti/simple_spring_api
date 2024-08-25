package com.simpleapi.simpleapi.game;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Game {
    @Id
    @SequenceGenerator(name = "game_sequence", sequenceName = "game_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "game_sequence")
    private Long id;
    private String title;
    private String genre;
    private Integer releaseYear;

    public Game() {
    }

    public Game(Long i, String title, String genre, Integer releaseYear) {
        this.id = i;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public Game(String title, String genre, Integer releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }
}
