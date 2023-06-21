package com.example.Leaderboard.Request;

import com.example.Leaderboard.Model.Team;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class TeamRequest {
    public Long playerId;
    public String playerName;
    public String password;
    public String teamName;
    public String sportName;


    public Team convertToTeam(){
        Team team =new Team();
        team.setPlayerId(this.playerId);
        team.setTeamName(this.playerName);
        team.setPassword(this.password);
        team.setTeamName(this.teamName);
        team.setSportName(this.sportName);

        return team;
    }
}
