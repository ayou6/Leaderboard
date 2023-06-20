package com.example.Leaderboard.Controller;
import com.example.Leaderboard.Model.Registration;
import com.example.Leaderboard.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("api/register")
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;
    @PostMapping
    public Registration createTeam(@RequestBody Registration registration) {
        return registrationService.createTeam(registration);
    }


}