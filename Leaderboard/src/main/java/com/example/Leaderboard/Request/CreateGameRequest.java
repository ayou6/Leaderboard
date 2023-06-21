package com.example.Leaderboard.Request;

import com.example.Leaderboard.Model.Game;
import com.example.Leaderboard.Model.Team;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateGameRequest {
    private Long id;
    private Team team1;
    private Team team2;
    private int score1;
    private int score2;


}