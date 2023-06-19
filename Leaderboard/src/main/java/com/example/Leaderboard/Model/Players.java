package com.example.Leaderboard.Model;

import lombok.*;


import javax.persistence.*;
import java.util.List;

@Data
@Getter
@Setter
@Entity

public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String playerName;
    private String passWord;
    public String sport;
    @OneToMany
    List<Game> games;
}
