package com.example.Leaderboard.Controller;

import com.example.Leaderboard.Model.Game;
import com.example.Leaderboard.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {
        @Autowired
        GameService gameService;

        @GetMapping("/getAllGames")
        public List<Game> getAllGames(){
            return gameService.getAllGames();
        }


}
