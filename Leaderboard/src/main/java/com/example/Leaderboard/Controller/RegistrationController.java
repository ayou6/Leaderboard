package com.example.Leaderboard.Controller;

import com.example.Leaderboard.Model.Registration;
import com.example.Leaderboard.Service.RegistrationService;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@RestController
@RequestMapping("api/register")
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;
    @PostMapping
    public Registration createTeam(Registration registration) {
        return registrationService.createTeam(registration);}


}