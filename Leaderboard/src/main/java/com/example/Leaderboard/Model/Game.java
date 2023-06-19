package com.example.Leaderboard.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public Team team1;
    public Team team2;
    public int score1;
    public int score2;

}
