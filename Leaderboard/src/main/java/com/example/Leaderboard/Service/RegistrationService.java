package com.example.Leaderboard.Service;

import com.example.Leaderboard.Model.Register;
import com.example.Leaderboard.Repository.RegistrationRepository;
import com.example.Leaderboard.Request.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.Registration;

@Service
public class RegistrationService {
    RegistrationRepository registrationRepository;
    private Register register;

    @Autowired
    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }
    public void RegisterTeam(RegistrationRequest registrationRequest) {
            Register register = null;
            register.setUsername(registrationRequest.getUserName());
            register.setPassword(registrationRequest.getPassword());
            register.setTeamName(registrationRequest.getTeamName());
            register.setSport(registrationRequest.getSportType());
            registrationRepository.save(this.register);

    }
}

