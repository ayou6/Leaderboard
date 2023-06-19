package com.example.Leaderboard.Model;

import lombok.*;


import javax.persistence.*;

@Data
@Getter
@Setter
@Entity

public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String playerName;
    String passWord;
    String sport;

}
