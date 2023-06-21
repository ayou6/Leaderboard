package com.example.Leaderboard.Request;

import com.example.Leaderboard.Model.Game;
import com.example.Leaderboard.Model.Team;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class GameRequest {
    private Long id;
    private Team team1;
    private Team team2;
    private int score1;
    private int score2;

    public Game convertToGame() {
        Game game = new Game();
        game.setTeam1(this.team1);
        game.setTeam2(this.team2);
        game.setScore1(this.score1);
        game.setScore2(this.score2);

        return game;
    }
}