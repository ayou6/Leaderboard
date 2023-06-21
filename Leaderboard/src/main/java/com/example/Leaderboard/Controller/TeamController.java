package com.example.Leaderboard.Controller;

import com.example.Leaderboard.Model.Team;
import com.example.Leaderboard.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/register")
public class TeamController {
    @Autowired
    TeamService teamService;
    @PostMapping
    public Team createTeam(@RequestBody Team team) {
        return teamService.createTeam(team);
    }

    @GetMapping(value = "getTeamById")
    public Team getTeamById(@RequestParam Long id) {
        Team teamById = teamService.getTeamById(id);
        return teamById;
    }
}
