package com.example.Leaderboard.Response;

import com.example.Leaderboard.Model.Team;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class GameResponse {
        private Long id;
        private Team team1;
        private Team team2;
        private int score1;
        private int score2;

    }