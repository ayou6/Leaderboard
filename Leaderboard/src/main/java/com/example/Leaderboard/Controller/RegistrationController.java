package com.example.Leaderboard.Controller;
import com.example.Leaderboard.Model.Player;
import com.example.Leaderboard.Model.Team;
import com.example.Leaderboard.Repository.PlayerRepository;
import com.example.Leaderboard.Repository.TeamRepository;
import com.example.Leaderboard.Request.RegistrationRequest;
import com.example.Leaderboard.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/register")
public class RegistrationController {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    RegistrationService registrationService;

    @Autowired
    TeamRepository teamRepository;

    @PostMapping("/player")
    public ResponseEntity<String> registerPlayer(@RequestBody Player player) {
        playerRepository.save(player);
        return new ResponseEntity<>("Player registered successfully", HttpStatus.OK);
    }

    @PostMapping("/team")
    public ResponseEntity<String> registerTeam(@RequestBody Team team) {
        teamRepository.save(team);
        return new ResponseEntity<>("Team registered successfully", HttpStatus.OK);

    }
}