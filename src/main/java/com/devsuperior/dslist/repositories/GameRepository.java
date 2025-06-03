package com.devsuperior.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

@Query("SELECT new com.devsuperior.dslist.dto.GameMinDTO(g) " +
           "FROM Belonging b " +
           "JOIN b.id.game g " +
           "WHERE b.id.gameList.id = :listId " +
           "ORDER BY b.position")
    List<GameMinDTO> searchByList(Long listId); // <- aqui é GameMinDTO

}
