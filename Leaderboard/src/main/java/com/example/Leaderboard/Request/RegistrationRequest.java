package com.example.Leaderboard.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {
    public Long id;
    public String userName;
    public String password;
    public String teamName;
    public String sportType;
}
