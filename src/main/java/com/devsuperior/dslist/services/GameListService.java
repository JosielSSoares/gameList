package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;

public class GameListService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findByList(Long listId) {
        return gameRepository.searchByList(listId);
    }
}
