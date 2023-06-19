package com.example.Leaderboard.Service;

import com.example.Leaderboard.Model.Game;
import com.example.Leaderboard.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGameById(Long id){
        return gameRepository.findById(id).get();
    }

}
