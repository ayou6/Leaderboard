package com.example.Leaderboard.Model;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity

public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String teamName;
    public String sportName;
    @ManyToOne
    @JoinColumn(name = "gameId")
    Game game;


}
