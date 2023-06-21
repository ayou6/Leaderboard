package com.example.Leaderboard.Response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TeamResponse {
    public Long playerId;
    public String playerName;
    public String password;
    public String teamName;
    public String sportName;
}
