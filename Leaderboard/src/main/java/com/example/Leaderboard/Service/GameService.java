package com.example.Leaderboard.Service;

import com.example.Leaderboard.Model.Game;
import com.example.Leaderboard.Model.Team;
import com.example.Leaderboard.Repository.GameRepository;
import com.example.Leaderboard.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;
    @Autowired
    TeamRepository teamRepository;
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGameById(Long id){
        return gameRepository.findById(id).get();
    }

    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    public Game assignTeams(Long gameId, List<Long> teamIds) {
        Game game = gameRepository.findById(gameId).get();
        for (Long teamId : teamIds) {
            Team team = teamRepository.findById(teamId).get();
            if (game.getTeam1() == null) {
                game.setTeam1(team);
            } else if (game.getTeam2() == null) {
                game.setTeam2(team);
            }
        }
        return gameRepository.save(game);
    }

}
