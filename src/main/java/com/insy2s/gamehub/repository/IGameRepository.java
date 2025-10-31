package com.insy2s.gamehub.repository;

import com.insy2s.gamehub.model.Game;
import com.insy2s.gamehub.model.GameCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IGameRepository extends JpaRepository<Game, Long> {
    Game findByTitle(String title);
    List<Game> findByCategory(GameCategory category);
    List<Game> findByAvailable(boolean available);

}
