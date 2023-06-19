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
    String userName;
    String password;
    String teamName;
    String sportName;
}
