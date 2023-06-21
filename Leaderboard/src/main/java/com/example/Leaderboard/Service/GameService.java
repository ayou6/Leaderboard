package com.example.Leaderboard.Service;
import com.example.Leaderboard.Model.Game;
import com.example.Leaderboard.Repository.GameRepository;
import com.example.Leaderboard.Request.CreateGameRequest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGameById(Long id) {
        return gameRepository.findById(id).orElse(null);
    }


    public void createGame(CreateGameRequest gameRequest) {
        Game game = new Game();
        gameRepository.save(game);
    }

    public void deleteAllGames() {
        gameRepository.deleteAll();
    }

    public Game updateGame(Long id, Game updatedGame) {
        Game existingGame = gameRepository.findById(id).orElse(null);
        if (existingGame != null) {
            existingGame.setTeam1(updatedGame.getTeam1());
            existingGame.setTeam2(updatedGame.getTeam2());
            existingGame.setScore1(updatedGame.getScore1());
            existingGame.setScore2(updatedGame.getScore2());
            return gameRepository.save(existingGame);
        }
        return null;
    }
}





