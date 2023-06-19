package com.example.Leaderboard.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String Team1;
    String Team2;
    int score1;
    int score2;



}
