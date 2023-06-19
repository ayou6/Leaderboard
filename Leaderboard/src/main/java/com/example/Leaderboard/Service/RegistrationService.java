package com.example.Leaderboard.Service;

import com.example.Leaderboard.Model.Registration;
import com.example.Leaderboard.Repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
@Autowired
    RegistrationRepository registrationRepository;
    public Registration createTeam(Registration registration) {
        return registrationRepository.save(registration);
    }
}