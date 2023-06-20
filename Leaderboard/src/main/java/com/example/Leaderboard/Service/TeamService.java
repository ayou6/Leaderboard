package com.example.Leaderboard.Service;

import com.example.Leaderboard.Model.Team;
import com.example.Leaderboard.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    @Autowired
    TeamRepository teamRepository;

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

}
