package com.leaderboard.leaderboard.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GameManageRequest {
    private String team1;
    private  String team2;
    private  Integer score1;
    private  Integer score2;
}