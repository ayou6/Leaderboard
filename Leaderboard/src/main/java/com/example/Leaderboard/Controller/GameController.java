package com.example.Leaderboard.Controller;

import com.example.Leaderboard.Model.Game;
import com.example.Leaderboard.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.kerberos.KerberosTicket;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/games")
public class GameController {
    @Autowired
    GameService gameService;

    @GetMapping("/getAllGames")
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/getGameById")
    public Game getGameById(@PathVariable("id") Long id) {
        return gameService.getGameById(id);
    }

    @PostMapping
    public Game createGame(@RequestBody Game game) {
        return gameService.createGame(game);
    }

    @PutMapping("/{gameId}/assign")
    public Game assignTeams(@PathVariable("gameId") Long gameId,
                            @RequestBody Map<String, List<Long>> requestBody) {
        List<Long> teamIds = requestBody.get("teamId");
        gameService.assignTeams(gameId, teamIds);
        return null;
    }
}
