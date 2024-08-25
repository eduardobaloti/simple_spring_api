package com.simpleapi.simpleapi.game;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    @Query("SELECT g FROM Game WHERE g.genre = ?1")
    Optional<List<Game>> getAllGamesByGenre(String genre);

}
