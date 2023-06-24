package com.example.Leaderboard.Controller;

import com.example.Leaderboard.Model.Game;
import com.example.Leaderboard.Repository.GameRepository;
import com.example.Leaderboard.Request.CreateGameRequest;
import com.example.Leaderboard.Response.GameResponse;
import com.example.Leaderboard.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/getAllGames")
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/getGameById")
    public Game getGameById(@RequestParam Long id) {
        return gameService.getGameById(id);
    }

    @PostMapping("/createGame")
    public ResponseEntity<String> createGame(@RequestBody CreateGameRequest gameRequest) {
        gameService.createGame(gameRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("Game created successfully.");
    }


    @PostMapping("/deleteAllGames")
    public void deleteAllGames() {
        gameService.deleteAllGames();
    }

 api
    }}