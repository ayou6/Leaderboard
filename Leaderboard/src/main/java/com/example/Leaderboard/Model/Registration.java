package com.example.Leaderboard.Model;

import lombok.*;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    public String userName;
    public String password;
    public String teamName;
    public String sportName;
}
