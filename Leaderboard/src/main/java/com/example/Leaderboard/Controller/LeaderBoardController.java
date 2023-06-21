package com.example.Leaderboard.Controller;

import com.example.Leaderboard.Model.Leaderboard;
import com.example.Leaderboard.Repository.LeaderBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LeaderBoardController {

    private final LeaderBoardRepository leaderboardRepository;

    @Autowired
    public LeaderBoardController(LeaderBoardRepository leaderboardRepository) {
        this.leaderboardRepository = leaderboardRepository;
    }

    @GetMapping("/api/leaderboard")
    public ResponseEntity<Object> getLeaderboard(@RequestParam("sport") String sport) {
        List<Leaderboard> leaderboard = leaderboardRepository.findBySport(sport);
        List<Standing> standings = new ArrayList<>();

        for (Leaderboard team : leaderboard) {
            int wins = team.getTeamWins();
            int losses = team.getTeamLosses();
            standings.add(new Standing(team.getTeamName(), wins, losses));
        }

        LeaderboardResponse payload = new LeaderboardResponse(standings);
        return new ResponseEntity<>(payload, HttpStatus.OK);
    }

    private static class LeaderboardResponse {
        private List<Standing> standings;

        public LeaderboardResponse(List<Standing> standings) {
            this.standings = standings;
        }

        public List<Standing> getStandings() {
            return standings;
        }
    }

    private static class Standing {
        private String teamName;
        private int wins;
        private int losses;

        public Standing(String teamName, int wins, int losses) {
            this.teamName = teamName;
            this.wins = wins;
            this.losses = losses;
        }

        public String getTeamName() {
            return teamName;
        }

        public int getWins() {
            return wins;
        }

        public int getLosses() {
            return losses;
        }
    }
}
